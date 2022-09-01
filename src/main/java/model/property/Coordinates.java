package model.property;

public class Coordinates {
    private final float longitude;
    private final float latitude;
    private final float depth;

    public Coordinates(float longitude, float latitude, float depth) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.depth = depth;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getDepth() {
        return depth;
    }
}
