package com.sensor.core.sensor;

import com.sensor.spi.AbstractSensor;
import com.sensor.shared.enums.SensorType;

public class TemperatureSensor extends AbstractSensor {
    public TemperatureSensor() {
        super(SensorType.TEMPERATURE);
    }
}
