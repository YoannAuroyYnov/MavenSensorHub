package com.sensor.core.sensor;

import com.sensor.shared.enums.SensorType;
import com.sensor.spi.AbstractSensor;

public class PressureSensor extends AbstractSensor {
    public PressureSensor() {
        super(SensorType.PRESSURE);
    }
}
