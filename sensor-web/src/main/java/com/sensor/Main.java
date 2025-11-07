package com.sensor.web;

import com.sensor.datamanagement.DataManager;
import com.sensor.mastersensorhub.Application;
import com.sensor.reportgeneration.ReportGenerator;
import com.sensor.sensordata.SensorFactory;
import com.sensor.userinterface.UserInterface;

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