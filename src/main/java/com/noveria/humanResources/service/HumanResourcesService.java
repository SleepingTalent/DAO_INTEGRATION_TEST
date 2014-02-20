package com.noveria.humanResources.service;

import com.noveria.humanResources.model.employee.dao.EmployeeDAO;
import com.noveria.humanResources.model.employee.entities.Employee;
import com.noveria.humanResources.service.exception.EmployeeNotFoundException;
import com.noveria.humanResources.view.employee.EmployeeViewBean;

import javax.persistence.NoResultException;

public class HumanResourcesService {

    EmployeeDAO employeeDAO;

    public HumanResourcesService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public EmployeeViewBean getEmployeeDetails(Long employeeId) throws EmployeeNotFoundException {
        try {

            Employee employee = employeeDAO.getEmployeeDetails(employeeId);
            return new EmployeeViewBean(employee);

        } catch (NoResultException e) {
            throw new EmployeeNotFoundException(e);
        }
    }
}
