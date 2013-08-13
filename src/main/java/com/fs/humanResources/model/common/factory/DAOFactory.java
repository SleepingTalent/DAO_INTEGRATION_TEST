package com.fs.humanResources.model.common.factory;


import java.util.HashMap;

public class DAOFactory {

    private static DAOFactory instance;
    private HashMap daoCache;

    public static DAOFactory getInstance() {
        if(instance == null) {
            createInstance();
        }
        return instance;
    }

    private static synchronized void createInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
    }

    private DAOFactory() {
        daoCache = new HashMap<String,Object>();
    }

}

