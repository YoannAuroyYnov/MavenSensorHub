package com.sensor.api.service;

import com.sensor.api.model.SensorData;
import com.sensor.shared.enums.SensorType;

import java.util.List;

public interface IDataStorage {
    List<SensorData> getAllStoredData();

    List<SensorData> getAllDataBySensorType(SensorType sensorType);
}
