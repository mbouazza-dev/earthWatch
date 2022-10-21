package model;

import model.property.Features;
import model.property.Metadata;

import java.util.*;

import org.apache.commons.lang.ArrayUtils;

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

    @Override
    public String toString() {
        return "{\"type"+'"'+':'+'"'+"FeatureCollection\""
                + ", \"metadata\":" + metadata
                + ", \"bbox\":" + bbox
                + ", \"features\":" + features
                + ", \"max_mag\":" + '"' + features.stream().map(x -> x.getProperties().getMag()).max(Float::compare).get() + '"'
                + "}";
    }
}