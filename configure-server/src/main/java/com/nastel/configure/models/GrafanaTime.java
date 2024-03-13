package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaTime {
    @JsonProperty("from")
    public String from;

    @JsonProperty("to")
    public String to;

    public GrafanaTime() {}

    public GrafanaTime(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

}
