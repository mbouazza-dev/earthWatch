[<img src="https://previews.123rf.com/images/findriyani/findriyani2007/findriyani200700185/153207836-earthquake-disaster-logo-vector-template.jpg" alt="EarthQuake logo" align="right" width="60" height="50"/>](https://previews.123rf.com/images/findriyani/findriyani2007/findriyani200700185/153207836-earthquake-disaster-logo-vector-template.jpg)

# Earthwatch

Please add your GitHub star ★, it will encourage me to publish more Monitoring Art dashboards.

Monitor earthquakes data with Grafana/Influxdb/Kafka. Real metrics. No dependency, no waiting for data
collection. Just pull .

## Dashboards

[![earthWatch - Monitoring Dashboard](https://github.com/mbouazza-dev/earthWatch/blob/main/image/dashboard.png)](https://github.com/mbouazza-dev/earthWatch/blob/main/image/dashboard.png)

## Installation

Execute this command in the /tig-stack folder after pulling the repo:

```
docker-compose up -d
```

The plugin will be installed into your grafana plugins directory; the default is
`/var/lib/grafana/plugins`.

## Dashboard Access

In order to check the dashboard, go to the following link
`http://localhost:3001/login`
And connect with the following credidentials:
`user : admin`
`password : admin`

## Configuration

No configuration required.
All the data is coming from the United States Geological Survey (USGS)

# Contribution

Feel free to create pull request to improve datasource/datasets quality.

## Author

[Mehdi Bouazza](https://www.linkedin.com/in/mehdi-bouazza9112/),
who loves monitoring systems and cutting/bleeding edge technologies: Docker,
Kubernetes, ECS, AWS, Google GCP, Terraform, Lambda, Kafka, Grafana, Elasticsearch,
Spark, ...
