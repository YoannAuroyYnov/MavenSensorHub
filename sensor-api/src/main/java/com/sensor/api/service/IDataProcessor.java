package com.sensor.core.service;

import com.sensor.sensordata.SensorData;
import com.sensor.sensordata.SensorType;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

interface IDataProcessor {
    Map<SensorType, Double> calculateAverage();

    Map<SensorType, Double> calculateMax();

    Map<SensorType, Double> calculateMin();

    Map<SensorType, LocalDateTime> calculateLastCollectorTime();

    Double calculateAverageBySensorType(SensorType sensorType);

    Double calculateMaxBySensorType(SensorType sensorType);

    Double calculateMinBySensorType(SensorType sensorType);

    LocalDateTime calculateLastCollectorTimeBySensorType(SensorType sensorType);

    Optional<SensorData> calculateLastSensorDataBySensorType(SensorType sensorType);
}
