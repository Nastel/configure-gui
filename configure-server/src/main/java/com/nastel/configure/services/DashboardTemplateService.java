package com.nastel.configure.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nastel.configure.models.GrafanaDashboardConfig;
import java.io.IOException;
import java.net.URL;

public class DashboardTemplateService {
    public static final ObjectMapper mapper = new ObjectMapper();

    public static GrafanaDashboardConfig buildTemplate(final URL url) throws IOException {
        return mapper.readValue(url, GrafanaDashboardConfig.class);
    }

}
