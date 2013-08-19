package com.fs.humanResources.model.employee.dao;

import com.fs.common.BaseDAOTest;
import com.fs.humanResources.model.employee.entities.Employee;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class EmployeeDAOIntegrationTest extends BaseDAOTest {

    EmployeeDAO employeeDAO;

    Employee employee;

    @Before
    public void setUp() {
        employeeDAO = new EmployeeDAO(getEntityManager());

        employee = new Employee();
        employee.setEmployeeId(1234l);
        employee.setFirstName("Dave");
        employee.setLastName("Smith");
        employee.setDateOfBirth(new Date());

        beginTransaction();
        employee = persitenceHelper.persistNewEmployee(employee);
    }

    @After
    public void tearDown() {
       endTransaction();
    }

    @Test
    public void countAll_returns_AsExpected() {
        Assert.assertEquals(1,employeeDAO.countAll());
    }

    @Test
    public void findById_returns_AsExpected() {
        Employee actual = employeeDAO.findById(employee.getId());

        Assert.assertEquals(employee.getId(),actual.getId());
        Assert.assertEquals(employee.getEmployeeId(),actual.getEmployeeId());
        Assert.assertEquals(employee.getFirstName(),actual.getFirstName());
        Assert.assertEquals(employee.getLastName(),actual.getLastName());
        Assert.assertEquals(employee.getDateOfBirth(),actual.getDateOfBirth());
    }

    @Test
    public void getEmployeeDetails_returns_AsExpected() {
        Employee actual = employeeDAO.getEmployeeDetails(employee.getEmployeeId());

        Assert.assertEquals(employee.getId(),actual.getId());
        Assert.assertEquals(employee.getEmployeeId(),actual.getEmployeeId());
        Assert.assertEquals(employee.getFirstName(),actual.getFirstName());
        Assert.assertEquals(employee.getLastName(),actual.getLastName());
        Assert.assertEquals(employee.getDateOfBirth(),actual.getDateOfBirth());
    }
}
