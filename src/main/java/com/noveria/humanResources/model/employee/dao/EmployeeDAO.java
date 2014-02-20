package com.noveria.humanResources.model.employee.dao;

import com.noveria.humanResources.model.common.dao.BaseDAO;
import com.noveria.humanResources.model.employee.entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


public class EmployeeDAO extends BaseDAO<Employee> {

    public EmployeeDAO(EntityManager entityManager) {
        super(Employee.class, entityManager);
    }

    public Employee getEmployeeDetails(Long employeeId) throws NoResultException {
        return findById(employeeId);
    }
}
