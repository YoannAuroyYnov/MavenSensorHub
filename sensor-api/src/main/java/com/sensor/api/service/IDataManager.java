package com.sensor.core.service;

import com.sensor.sensordata.ISensor;
import com.sensor.sensordata.SensorData;

import java.util.List;

public interface IDataManager extends IDataProcessor {
    void addDataCollector(ISensor sensor);

    void collectAndStoreData();

    List<SensorData> getAllData();
}
