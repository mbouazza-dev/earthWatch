package model;

import model.property.Bbox;
import model.property.Features;
import model.property.Metadata;

public class Earthquake {
    private final Metadata metadata;
    private final Features[] features;
    private final Bbox bbox;

    public Earthquake(Metadata metadata, Features[] features, Bbox bbox) {
        this.metadata = metadata;
        this.features = features;
        this.bbox = bbox;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Features[] getFeatures() {
        return features;
    }

    public Bbox getBbox() {
        return bbox;
    }
}
