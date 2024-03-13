package com.nastel.configure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaDashboardConfig {
    @JsonProperty("dashboard")
    public GrafanaDashboard dashboard;

    @JsonProperty("overwrite")
    public Boolean overwrite;

    @JsonProperty("message")
    public String message;

    @JsonProperty("folderUid")
    public String folderUid;

    public GrafanaDashboardConfig() {}

    public GrafanaDashboardConfig(final GrafanaDashboard dashboard, final Boolean overwrite, final String message, final String folderUid) {
        this.dashboard = dashboard;
        this.overwrite = overwrite;
        this.message = message;
        this.folderUid = folderUid;
    }
}
