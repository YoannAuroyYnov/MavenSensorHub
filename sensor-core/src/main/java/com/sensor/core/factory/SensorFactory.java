package com.sensor.core.factory;

import com.sensor.api.sensor.ISensor;
import com.sensor.api.sensor.ISensorFactory;
import com.sensor.core.sensor.HumiditySensor;
import com.sensor.core.sensor.PressureSensor;
import com.sensor.core.sensor.TemperatureSensor;
import com.sensor.core.sensor.WindSpeedSensor;
import com.sensor.shared.enums.SensorType;

public class SensorFactory implements ISensorFactory {
    @Override
    public ISensor make(SensorType sensorType) {
        return switch (sensorType) {
            case TEMPERATURE -> new TemperatureSensor();
            case HUMIDITY -> new HumiditySensor();
            case PRESSURE -> new PressureSensor();
            case WIND_SPEED -> new WindSpeedSensor();
        };
    }
}
