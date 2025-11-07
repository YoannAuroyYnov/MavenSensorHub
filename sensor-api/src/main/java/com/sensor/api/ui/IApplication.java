package com.sensor.api.ui;

import com.sensor.api.service.IDataManager;
import com.sensor.shared.enums.UserAction;

public interface IApplication {
    void manageOrder(UserAction userAction);

    IDataManager getDataManager();
}
