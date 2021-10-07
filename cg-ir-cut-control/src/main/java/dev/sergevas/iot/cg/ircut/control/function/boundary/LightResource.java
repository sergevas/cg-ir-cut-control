package dev.sergevas.iot.cg.ircut.control.function.boundary;

import dev.sergevas.iot.cg.ircut.control.function.model.ReadingsEvent;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class LightResource {

    @Inject
    Logger logger;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postLightRedings(ReadingsEvent readingsEvent) {
        logger.infof("Have got a %s", readingsEvent);
        return Response
                .noContent()
                .status(Response.Status.ACCEPTED)
                .build();
    }
}
