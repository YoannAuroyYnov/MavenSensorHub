package com.sensor.api.userinterface;

import com.sensor.datamanagement.IDataManager;

public interface IApplication {
    void manageOrder(UserAction userAction);

    IDataManager getDataManager();
}
