package model.property;

public class Metadata {
    private final Long generated;
    private final String url;
    private final String title;
    private final String api;
    private final int count;
    private final int status;

    public Metadata(Long generated, String url, String title, String api, int count, int status) {
        this.generated = generated;
        this.url = url;
        this.title = title;
        this.api = api;
        this.count = count;
        this.status = status;
    }

    public Long getGenerated() {
        return generated;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getApi() {
        return api;
    }

    public int getCount() {
        return count;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "{\"Metadata\":{"
                + "\"generated\":\"" + generated + "\""
                + ", \"url\":\"" + url + "\""
                + ", \"title\":\"" + title + "\""
                + ", \"api\":\"" + api + "\""
                + ", \"count\":\"" + count + "\""
                + ", \"status\":\"" + status + "\""
                + "}}";
    }
}
