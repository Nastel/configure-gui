package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaTarget {
    @JsonProperty("datasource")
    public GrafanaDatasource datasource;

    @JsonProperty("jkql")
    public String jkql;

    @JsonProperty("refId")
    public String refId;

    @JsonProperty("hide")
    public Boolean hide;

    public GrafanaTarget() {}

    public GrafanaTarget(final GrafanaDatasource datasource, final String jkql, final String refId) {
        this.datasource = datasource;
        this.jkql = jkql;
        this.refId = refId;
    }

}
