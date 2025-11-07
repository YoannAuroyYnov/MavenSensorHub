package com.sensor;


import com.sensor.core.service.DataManager;
import com.sensor.core.factory.SensorFactory; 
import com.sensor.report.impl.ReportGenerator;
import com.sensor.web.ui.UserInterface;

public enum Main {
    ;

    public static void main(String[] args) {
        Application application = new Application();
        application.setDataManager(new DataManager());
        application.setSensorFactory(new SensorFactory());
        application.setReportGenerator(new ReportGenerator());
        application.setUserInterface(new UserInterface(application));
        application.start();
    }
}