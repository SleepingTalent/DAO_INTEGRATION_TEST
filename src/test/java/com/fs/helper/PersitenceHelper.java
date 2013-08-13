package com.fs.helper;

import com.fs.humanResources.model.common.factory.DAOFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class PersitenceHelper {

    private EntityManager entityManager;

    private EntityTransaction entityTransaction;

    private DAOFactory daoFactory;

    public PersitenceHelper(EntityManager entityManager) {
        this.daoFactory = DAOFactory.getInstance();
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
