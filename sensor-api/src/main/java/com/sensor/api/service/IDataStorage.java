package com.sensor.core.service;

import com.sensor.sensordata.SensorData;
import com.sensor.sensordata.SensorType;

import java.util.List;

public interface IDataStorage {
    List<SensorData> getAllStoredData();

    List<SensorData> getAllDataBySensorType(SensorType sensorType);
}
