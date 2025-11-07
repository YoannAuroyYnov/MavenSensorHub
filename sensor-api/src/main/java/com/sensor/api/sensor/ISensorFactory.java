package com.sensor.core.sensor;

public interface ISensorFactory {
    ISensor make(SensorType sensorType);
}
