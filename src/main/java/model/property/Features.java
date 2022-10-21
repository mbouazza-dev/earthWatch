package model.property;

public class Features {
    private final String type;
    private final Properties properties;
    private final Geometry geometry;
    private final String id;

    public Features(String type, Properties properties, Geometry geometry, String id) {
        this.type = type;
        this.properties = properties;
        this.geometry = geometry;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Properties getProperties() {
        return properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{\"type\":\"" + this.type + "\""
                + ", \"properties\": {"
                + " \"mag\":\"" + properties.getMag() + "\""
                + ", \"place\":\"" + properties.getPlace() + "\""
                + ", \"time\":\"" + properties.getTime() + "\""
                + ", \"updated\":\"" + properties.getUpdated() + "\""
                + ", \"tz\":\"" + properties.getTz() + "\""
                + ", \"url\":\"" + properties.getUrl() + "\""
                + ", \"detail\":\"" + properties.getDetail() + "\""
                + ", \"felt\":\"" + properties.getFelt() + "\""
                + ", \"cdi\":\"" + properties.getCdi() + "\""
                + ", \"mmi\":\"" + properties.getMmi() + "\""
                + ", \"alert\":\"" + properties.getAlert() + "\""
                + ", \"status\":\"" + properties.getStatus() + "\""
                + ", \"tsunami\":\"" + properties.getTsunami() + "\""
                + ", \"sig\":\"" + properties.getSig() + "\""
                + ", \"net\":\"" + properties.getNet()+ "\""
                + ", \"code\":\"" + properties.getCode() + "\""
                + ", \"ids\":\"" + properties.getIds() + "\""
                + ", \"sources\":\"" + properties.getSources() + "\""
                + ", \"types\":\"" + properties.getTypes() + "\""
                + ", \"nst\":\"" + properties.getNst() + "\""
                + ", \"dmin\":\"" + properties.getDmin() + "\""
                + ", \"rms\":\"" + properties.getRms() + "\""
                + ", \"gap\":\"" + properties.getGap() + "\""
                + ", \"magType\":\"" + properties.getMagType() + "\""
                + ", \"type\":\"" + properties.getType() + "\""
                + ", \"longitude\":\"" + geometry.getCoordinates().get(0) + "\""
                + ", \"latitude\":\"" + geometry.getCoordinates().get(1) + "\""
                + ", \"altitude\":\"" + geometry.getCoordinates().get(2) + "\"" + "}"
                + ", \"id\":\"" + id + "\""
                + "}";
    }
}
