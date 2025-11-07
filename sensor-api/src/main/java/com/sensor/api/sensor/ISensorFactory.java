package com.sensor.api.sensor;

import com.sensor.shared.enums.SensorType;
public interface ISensorFactory {
    ISensor make(SensorType sensorType);
}
