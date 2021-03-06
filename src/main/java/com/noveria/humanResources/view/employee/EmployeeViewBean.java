package com.noveria.humanResources.view.employee;
import com.noveria.humanResources.model.address.helper.AddressHelper;
import com.noveria.humanResources.model.employee.entities.Employee;
import com.noveria.humanResources.view.address.AddressViewBean;

import java.util.Date;

public class EmployeeViewBean {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Long empolyeeId;
    private AddressViewBean address;

    public EmployeeViewBean(Long empolyeeId,String firstName, String lastName, Date dateOfBirth, AddressViewBean address) {
        this(empolyeeId,firstName,lastName, dateOfBirth);

        this.address = address;
    }

    public EmployeeViewBean(Long empolyeeId,String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.empolyeeId = empolyeeId;
    }

    public EmployeeViewBean(Employee employee) {
        this(employee.getId(),employee.getFirstName(),employee.getLastName(),
                employee.getDateOfBirth());

       AddressHelper addressHelper = new AddressHelper();
       this.address =  new AddressViewBean(addressHelper.findPrimaryAddress(employee.getAddressList()));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getEmpolyeeId() {
        return empolyeeId;
    }

    public AddressViewBean getAddress() {
        return address;
    }
}
