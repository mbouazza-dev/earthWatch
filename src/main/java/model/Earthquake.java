package model;

import model.property.Features;
import model.property.Metadata;

import java.util.List;

public class Earthquake {
    private final Metadata metadata;
    private final List<Features> features;
    private final List<Float> bbox;

    public Earthquake(Metadata metadata, List<Features> features, List<Float> bbox) {
        this.metadata = metadata;
        this.features = features;
        this.bbox = bbox;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public List<Float> getBbox() {
        return bbox;
    }
}
