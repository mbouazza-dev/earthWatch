package model.property;

public class Properties {
    private final float mag;
    private final String place;
    private final long time;
    private final long updated;
    private final int tz;
    private final String url;
    private final String detail;
    private final int felt;
    private final float cdi;
    private final float mmi;
    private final String alert;
    private final String status;
    private final int tsunami;
    private final int sig;
    private final String net;
    private final String code;
    private final String ids;
    private final String sources;
    private final String types;
    private final int nst;
    private final float dmin;
    private final float rms;
    private final float gap;
    private final String magType;
    private final String type;

    public Properties(float mag, String place, long time, long updated, int tz, String url, String detail, int felt, float cdi, float mmi, String alert, String status, int tsunami, int sig, String net, String code, String ids, String sources, String types, int nst, float dmin, float rms, float gap, String magType, String type) {
        this.mag = mag;
        this.place = place;
        this.time = time;
        this.updated = updated;
        this.tz = tz;
        this.url = url;
        this.detail = detail;
        this.felt = felt;
        this.cdi = cdi;
        this.mmi = mmi;
        this.alert = alert;
        this.status = status;
        this.tsunami = tsunami;
        this.sig = sig;
        this.net = net;
        this.code = code;
        this.ids = ids;
        this.sources = sources;
        this.types = types;
        this.nst = nst;
        this.dmin = dmin;
        this.rms = rms;
        this.gap = gap;
        this.magType = magType;
        this.type = type;
    }

    public float getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public long getTime() {
        return time;
    }

    public long getUpdated() {
        return updated;
    }

    public int getTz() {
        return tz;
    }

    public String getUrl() {
        return url;
    }

    public String getDetail() {
        return detail;
    }

    public int getFelt() {
        return felt;
    }

    public float getCdi() {
        return cdi;
    }

    public float getMmi() {
        return mmi;
    }

    public String getAlert() {
        return alert;
    }

    public String getStatus() {
        return status;
    }

    public int getTsunami() {
        return tsunami;
    }

    public int getSig() {
        return sig;
    }

    public String getNet() {
        return net;
    }

    public String getCode() {
        return code;
    }

    public String getIds() {
        return ids;
    }

    public String getSources() {
        return sources;
    }

    public String getTypes() {
        return types;
    }

    public int getNst() {
        return nst;
    }

    public float getDmin() {
        return dmin;
    }

    public float getRms() {
        return rms;
    }

    public float getGap() {
        return gap;
    }

    public String getMagType() {
        return magType;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{\"Properties\":{"
                + "\"mag\":\"" + mag + "\""
                + ", \"place\":\"" + place + "\""
                + ", \"time\":\"" + time + "\""
                + ", \"updated\":\"" + updated + "\""
                + ", \"tz\":\"" + tz + "\""
                + ", \"url\":\"" + url + "\""
                + ", \"detail\":\"" + detail + "\""
                + ", \"felt\":\"" + felt + "\""
                + ", \"cdi\":\"" + cdi + "\""
                + ", \"mmi\":\"" + mmi + "\""
                + ", \"alert\":\"" + alert + "\""
                + ", \"status\":\"" + status + "\""
                + ", \"tsunami\":\"" + tsunami + "\""
                + ", \"sig\":\"" + sig + "\""
                + ", \"net\":\"" + net + "\""
                + ", \"code\":\"" + code + "\""
                + ", \"ids\":\"" + ids + "\""
                + ", \"sources\":\"" + sources + "\""
                + ", \"types\":\"" + types + "\""
                + ", \"nst\":\"" + nst + "\""
                + ", \"dmin\":\"" + dmin + "\""
                + ", \"rms\":\"" + rms + "\""
                + ", \"gap\":\"" + gap + "\""
                + ", \"magType\":\"" + magType + "\""
                + ", \"type\":\"" + type + "\""
                + "}}";
    }
}
