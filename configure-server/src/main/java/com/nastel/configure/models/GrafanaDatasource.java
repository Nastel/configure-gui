package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaDatasource {
    @JsonProperty("type")
    public String type;

    @JsonProperty("uid")
    public String uid;

    public GrafanaDatasource() {}

    public GrafanaDatasource(final String type, final String uid) {
        this.type = type;
        this.uid = uid;
    }
}
