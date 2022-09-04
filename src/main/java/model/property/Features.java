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
        return "{\"Features\":{"
                + "\"type\":\"" + type + "\""
                + ", \"properties\":" + properties
                + ", \"geometry\":" + geometry
                + ", \"id\":\"" + id + "\""
                + "}}";
    }
}
