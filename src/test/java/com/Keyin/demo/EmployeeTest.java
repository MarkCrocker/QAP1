package com.Keyin.demo;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testGetSalary() {
        Employee employeeUnderTest = new Employee(1, "Mark", "Crocker", 4500);
        Employee employee2UnderTest = new Employee(2, "kelli", "Strickland", 5000);

        Assert.assertTrue(employeeUnderTest.getSalary() == 4500);
        Assert.assertTrue(employee2UnderTest.getSalary()== 5000);
    }

    @Test
    public void testGetAnnualSalary() {
        Employee employeeUnderTest = new Employee(1, "Mark", "Crocker", 100);

        Assert.assertTrue(employeeUnderTest.getAnnualSalary() == (100 * 12));
    }

    @Test
    public void testRaiseSalary() {
        Employee employeeUnderTest1 = new Employee(1, "Mark", "Crocker", 4500);
        Employee employeeUnderTest2 = new Employee(2, "Kelli", "Strickland", 5000);

        Assert.assertTrue(employeeUnderTest1.raiseSalary(20) == 5400);
        Assert.assertTrue(employeeUnderTest2.raiseSalary(40) == 7000);
    }

    @Test
    public void testEmployeesAreNotEqual() {
        Employee employeeUnderTest1 = new Employee(1, "Mark", "Crocker", 4500);
        Employee employeeUnderTest2 = new Employee(2, "Kelli", "Strickland", 5000);

        Assert.assertFalse(employeeUnderTest1 == employeeUnderTest2);

    }
}
