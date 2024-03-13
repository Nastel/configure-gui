package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaPanel {
    @JsonProperty("datasource")
    private GrafanaDatasource datasource;

    @JsonProperty("gridPos")
    private GrafanaGridPosition gridPos;

    @JsonProperty("targets")
    private List<GrafanaTarget> targets;

    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private String type;

    @JsonProperty("overrides")
    private Map<String, Object> overrides;

    @JsonProperty("fieldConfig")
    private Map<String, Object> fieldConfig;

    @JsonProperty("options")
    private Map<String, Object> options;

    public GrafanaPanel() {}

    public GrafanaPanel(final GrafanaDatasource datasource, final GrafanaGridPosition gridPos, final List<GrafanaTarget> targets, final String title, final String type, final Map<String, Object> overrides, final Map<String, Object> fieldConfig, final Map<String, Object> options) {
        this.datasource = datasource;
        this.gridPos = gridPos;
        this.targets = targets;
        this.title = title;
        this.type = type;
        this.overrides = overrides;
        this.fieldConfig = fieldConfig;
        this.options = options;
    }

}
