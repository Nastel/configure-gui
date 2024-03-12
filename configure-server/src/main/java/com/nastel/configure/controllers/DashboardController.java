package com.nastel.configure.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("dashboards")
public class DashboardController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getDashboards() {
        return "";
    }
}
