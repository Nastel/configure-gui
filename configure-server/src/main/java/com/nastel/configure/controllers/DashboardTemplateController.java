package com.nastel.configure.controllers;

import com.nastel.configure.services.DashboardTemplateService;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class DashboardTemplateController {
    private static final String templatesPath = System.getProperty("grafana.templates.path");

    @GET
    @Path("/template_dashboard")
    @Produces(MediaType.APPLICATION_JSON)
    public static Response getTemplateDashboards() {
        try (final Stream<java.nio.file.Path> entries = Files.list(java.nio.file.Path.of(templatesPath))) {
            return Response.ok(entries.map(path -> {
                try {
                    return DashboardTemplateService.buildTemplate(path.toUri().toURL());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toUnmodifiableList())).build();
        } catch (final Exception e) {
            return Response.serverError().entity(e).build();
        }
    }

}
