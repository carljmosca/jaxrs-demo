/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jaxrs.demo.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *
 * @author moscac
 */
@Path("widget")
public class WidgetService {

    @GET
    public Response search(
            @MatrixParam("parameters") List<WidgetAttribute> attributes) {

        Response response;
        try {
            ResponseBuilder rb = Response.ok((Object) doSearch(attributes));
            response = rb.build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        if (response == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return response;
    }

    private List<WidgetService> doSearch(List<WidgetAttribute> attributes) {
        List<WidgetService> result = new ArrayList<>();
        for (WidgetAttribute attribute : attributes) {

        }
        return result;
    }

}
