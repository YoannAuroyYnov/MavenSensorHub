package com.sensor.spi.reportgeneration;

import com.sensor.sensordata.SensorData;

import java.util.List;

public interface IReportGenerator {
    void generate(ReportType reportType, List<SensorData> data);
}
