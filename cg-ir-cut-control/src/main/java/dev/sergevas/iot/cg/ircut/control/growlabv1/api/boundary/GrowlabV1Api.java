/**
 * OpenAPI spec for Raspberry Pi #growlab resources:
 * - GET temperature, humidity, and pressure readings
 * - GET light intensity readings
 * - GET RPi Camera module image
 * - GET RPi Camera module current mode
 * - PUT to set RPi Camera module current mode
 * - GET Health checks
 *
 * The version of the OpenAPI document: 1.0.0
 */

package dev.sergevas.iot.cg.ircut.control.growlabv1.api.boundary;

import dev.sergevas.iot.cg.ircut.control.growlabv1.api.model.CameraModeSetType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;

/**
 *
 * - PUT to set RPi Camera module current mode
 */

@RegisterRestClient(configKey = "growlabv1-api")
public interface GrowlabV1Api {

    /**
     * Set the camera operation mode
     *
     * Can be used to set the camera operation mode
     *
     */
    @PUT
    @Path("/actuators/camera/mode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    void putCameraMode(CameraModeSetType cameraModeSetType) throws ApiException, ProcessingException;
}

