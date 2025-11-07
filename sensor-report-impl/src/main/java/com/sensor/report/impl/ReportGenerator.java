package com.sensor.report.impl;

import com.sensor.api.model.SensorData;
import com.sensor.shared.enums.ReportType;
import com.sensor.spi.IReportGenerator;

import java.util.List;

public class ReportGenerator implements IReportGenerator {
    @Override
    public void generate(final ReportType reportType, List<SensorData> data) {
        switch (reportType) {
            case TEXT -> new TextReportGenerator().generateReport(data);
            case CSV -> new CSVReportGenerator().generateReport(data);
        }
    }
}
