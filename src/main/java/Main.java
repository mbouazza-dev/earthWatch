import kafka.Producer;
import model.Earthquake;
import utils.ApiCall;
import utils.Deserialize;

import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Producer p = new Producer();
        p.run();

        /*Timer timer = new Timer ();
        TimerTask hourlyTask = new TimerTask () {
            @Override
            public void run () {
                Earthquake e = Deserialize.deserialize(ApiCall.get("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+java.time.LocalDate.now()+"T"+java.time.LocalTime.now().minusHours(3).format(DateTimeFormatter.ofPattern("HH:mm:ss"))));
                System.out.println(e.toString());
            }
        };
        // schedule the task to run starting now and then every hour...
        timer.schedule (hourlyTask, 0l, 1000*60*60);


         */
    }
}
