package com.sensor.core.sensor;

import com.sensor.shared.enums.SensorType;
import com.sensor.spi.AbstractSensor;
public class WindSpeedSensor extends AbstractSensor {
    public WindSpeedSensor() {
        super(SensorType.WIND_SPEED);
    }
}
