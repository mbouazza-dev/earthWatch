package model.property;

import model.property.Coordinates;

public class Geometry {
    private final String type;
    private final Coordinates coordinates;

    public Geometry(String type, Coordinates coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
