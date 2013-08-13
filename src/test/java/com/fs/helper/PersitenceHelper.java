package com.fs.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class PersitenceHelper {

    private EntityManager entityManager;

    private EntityTransaction entityTransaction;

    public PersitenceHelper(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public PersitenceHelper(EntityManagerFactory entityManagerFactory) {
       this(entityManagerFactory.createEntityManager())  ;
    }

    public void beginTransaction() {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
    }

    public void rollbackTransaction() {
        entityTransaction.rollback();
    }

    public void commitTransaction() {
        entityTransaction.commit();
    }

    public void closeSession() {
        if(null != entityManager) {
            entityManager.close();
        }
    }
}
