package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaDashboard {
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("uid")
    public String uid;

    @JsonProperty("title")
    public String title;

    @JsonProperty("tags")
    public List<String> tags;

    @JsonProperty("timezone")
    public String timezone;

    @JsonProperty("schemaVersion")
    public Integer schemaVersion;

    @JsonProperty("refresh")
    public String refresh;

    @JsonProperty("panels")
    public List<GrafanaPanel> panels;

    @JsonProperty("templating")
    public Map<String, Object> templating;

    @JsonProperty("links")
    public List<Map<String, Object>> links;

    @JsonProperty("time")
    public GrafanaTime time;

    public GrafanaDashboard() {}

    public GrafanaDashboard(final String uid, final String title, final List<String> tags, final List<GrafanaPanel> panels, final GrafanaTime time, final Map<String, Object> templating, final List<Map<String, Object>> links) {
        this.uid = uid;
        this.title = title;
        this.tags = tags;
        this.panels = panels;
        this.time = time;
        this.templating = templating;
        this.links = links;
    }

}
