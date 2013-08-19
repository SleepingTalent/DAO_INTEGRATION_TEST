package com.fs.humanResources.model.address.dao;

import com.fs.humanResources.model.address.entities.Address;
import com.fs.humanResources.model.common.dao.BaseDAO;

import javax.persistence.EntityManager;

public class AddressDAO extends BaseDAO<Address>{

    public AddressDAO() {
        super(Address.class);
    }

    public AddressDAO(EntityManager entityManager) {
        super(Address.class,entityManager);
    }
}
