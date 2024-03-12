package com.nastel.configure.controllers;

import com.nastel.configure.services.ConnectionService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("connections")
public class ConnectionController {
    ConnectionService connectionService;

    public ConnectionController() {
        this.connectionService = new ConnectionService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getConnections() {
        try {
            return Response.ok().entity(connectionService.getConnections()).build();
        } catch (Exception e) {
            return Response.serverError().entity(e).build();
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getConnection(@PathParam("id") String id) {
        try {
            return Response.ok().entity(connectionService.getConnection(id)).build();
        } catch (Exception e) {
            return Response.serverError().entity(e).build();
        }
    }

    @POST
    public Response createConnection() {
        try {
            connectionService.createConnection();
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception e) {
            return Response.serverError().entity(e).build();
        }
    }

    @PUT
    @Path("{id}")
    public Response updateConnection(@PathParam("id") String id) {
        try {
            connectionService.updateConnection(id);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().entity(e).build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response deleteConnection(@PathParam("id") String id) {
        try {
            connectionService.deleteConnection(id);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.serverError().entity(e).build();
        }
    }
}
