package com.fs.humanResources.model.common.factory;


import com.fs.common.BaseUnitTest;
import junit.framework.Assert;
import org.junit.Test;

public class DAOFactoryTest extends BaseUnitTest {

    @Test
    public void newEmployDAO_returnsAsExpected() {
        Assert.assertEquals("com.fs.humanResources.model.employee.dao.EmployeeDAO",DAOFactory.getInstance().newEmployDAO().getClass().getName());
    }

}
