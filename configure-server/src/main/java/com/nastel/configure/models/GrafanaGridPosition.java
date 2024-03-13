package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaGridPosition {
    @JsonProperty("w")
    public Integer width;

    @JsonProperty("h")
    public Integer height;

    @JsonProperty("x")
    public Integer x;

    @JsonProperty("y")
    public Integer y;

    public GrafanaGridPosition() {}

    public GrafanaGridPosition(final Integer width, final Integer height, final Integer x, final Integer y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

}
