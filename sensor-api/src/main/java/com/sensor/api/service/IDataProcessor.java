package com.sensor.api.service;

import com.sensor.api.model.SensorData;
import com.sensor.shared.enums.SensorType;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

public interface IDataProcessor {
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
