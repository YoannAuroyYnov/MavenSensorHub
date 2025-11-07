package com.sensor.core.sensor;

import com.sensor.spi.AbstractSensor;
import com.sensor.shared.enums.SensorType;

public class HumiditySensor extends AbstractSensor {

    public HumiditySensor() {
        super(SensorType.HUMIDITY);
    }
}
