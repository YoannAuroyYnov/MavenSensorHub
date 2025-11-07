package com.sensor.spi;

import com.sensor.api.model.SensorData;
import com.sensor.shared.enums.ReportType;

import java.util.List;

public interface IReportGenerator {
    void generate(ReportType reportType, List<SensorData> data);
}
