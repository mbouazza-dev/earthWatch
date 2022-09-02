package model.property;


import java.util.List;

public class Geometry {
    private final String type;
    private final List<Float> coordinates;

    public Geometry(String type, List<Float> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }
}
