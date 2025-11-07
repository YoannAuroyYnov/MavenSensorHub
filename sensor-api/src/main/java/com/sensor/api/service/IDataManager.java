package com.sensor.api.service;

import com.sensor.api.model.SensorData;
import com.sensor.api.sensor.ISensor;
import java.util.List;

public interface IDataManager extends IDataProcessor {
    void addDataCollector(ISensor sensor);

    void collectAndStoreData();

    List<SensorData> getAllData();
}
