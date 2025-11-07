package com.sensor.api.sensor;

import com.sensor.api.model.SensorData;
import com.sensor.shared.enums.SensorType;
public interface ISensor {
    SensorType getSensorType();

    SensorData getSensorData();
}
