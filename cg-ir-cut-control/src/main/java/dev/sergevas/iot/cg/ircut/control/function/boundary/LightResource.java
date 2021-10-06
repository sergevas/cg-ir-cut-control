package dev.sergevas.iot.cg.ircut.control.function.boundary;

import dev.sergevas.iot.cg.ircut.control.function.model.ReadingsEvent;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class LightResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postLightRedings(ReadingsEvent readingsEvent) {
        return null;
    }
}
