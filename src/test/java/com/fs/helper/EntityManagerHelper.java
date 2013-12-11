package com.fs.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;


public class EntityManagerHelper {

    public static EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("integration-test");
    }
}
