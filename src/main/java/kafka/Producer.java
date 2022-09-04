package kafka;

import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Earthquake;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import utils.ApiCall;
import utils.Deserialize;

public class Producer implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(Producer.class.getName());
    private static final String TOPIC_NAME = "general-events";
    private KafkaProducer<Long, String> kafkaProducer = null;
    private final String KAFKA_CLUSTER_ENV_VAR_NAME = "KAFKA_CLUSTER";

    public Producer() {
        LOGGER.log(Level.INFO, "Kafka Producer running in thread {0}", Thread.currentThread().getName());
        Properties kafkaProps = new Properties();

        String defaultClusterValue = "localhost:9092";
        String kafkaCluster = System.getProperty(KAFKA_CLUSTER_ENV_VAR_NAME, defaultClusterValue);
        LOGGER.log(Level.INFO, "Kafka cluster {0}", kafkaCluster);

        kafkaProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaCluster);
        kafkaProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.LongSerializer");
        kafkaProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProps.put(ProducerConfig.ACKS_CONFIG, "0");

        this.kafkaProducer = new KafkaProducer<>(kafkaProps);

    }

    @Override
    public void run() {
        try {
            produce();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    /**
     * produce messages
     *
     * @throws Exception
     */
    private void produce() throws Exception {
        ProducerRecord<Long, String> record = null;

        try {
            while (true) {

                Earthquake e = Deserialize.deserialize(ApiCall.get("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+java.time.LocalDate.now()+"T"+java.time.LocalTime.now().minusHours(3).format(DateTimeFormatter.ofPattern("HH:mm:ss"))));
                record = new ProducerRecord<Long, String>(TOPIC_NAME, e.getMetadata().getGenerated(), e.toString());
                    kafkaProducer.send(record, new Callback() {
                        @Override
                        public void onCompletion(RecordMetadata rm, Exception excptn) {
                            if (excptn != null) {
                                LOGGER.log(Level.WARNING, "Error sending message with key {0}\n{1}", new Object[]{e.getMetadata().getGenerated(), excptn.getMessage()});
                            } else {
                                LOGGER.log(Level.INFO, "Partition for key-value {0}::{1} is {2}", new Object[]{e.getMetadata().getGenerated(), e.toString(), rm.partition()});
                            }

                        }
                    });
                    /**
                     * wait before sending next message. this has been done on
                     * purpose
                     */
                    Thread.sleep(3600000);

            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Producer thread was interrupted");
        } finally {
            kafkaProducer.close();

            LOGGER.log(Level.INFO, "Producer closed");
        }

    }

}