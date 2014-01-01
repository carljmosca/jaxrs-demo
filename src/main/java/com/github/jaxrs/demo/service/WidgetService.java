/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jaxrs.demo.service;

import com.github.jaxrs.demo.WidgetAttribute;
import com.github.jaxrs.demo.Widget;
import com.github.jaxrs.demo.WidgetResponse;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *
 * @author moscac
 */
@Path("widget")
public class WidgetService {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response search(
            @QueryParam("parameters") List<WidgetAttribute> attributes) {

        Response response;
        try {
            ResponseBuilder rb = Response.ok(doSearch(attributes));
            response = rb.build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        if (response == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return response;
    }

    private WidgetResponse doSearch(List<WidgetAttribute> attributes) {
        WidgetResponse result = new WidgetResponse();
        for (WidgetAttribute attribute : attributes) {
            for (Widget widget : getWidgets()) {
                if (widget.getDescription().contains(attribute.getDescription()))
                    result.getList().add(widget);
            }
        }
        return result;
    }

    private List<Widget> getWidgets() {
        List<Widget> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Widget(i, "widget " + i));
        }
        return list;
    }
}
