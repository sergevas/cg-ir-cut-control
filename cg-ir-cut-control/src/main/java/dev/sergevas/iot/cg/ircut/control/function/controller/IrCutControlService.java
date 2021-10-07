package dev.sergevas.iot.cg.ircut.control.function.controller;

import dev.sergevas.iot.cg.ircut.control.function.model.ReadingsEvent;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IrCutControlService {

    public static double NIGHT_MODE_THRESHOLD = 0.0;
    public static double NORM_MODE_THRESHOLD = 300.0;

    public void controlMode(ReadingsEvent readingsEvent) {
        double light = Double.parseDouble(String.valueOf(readingsEvent.getData().getValue()));
    }
}
