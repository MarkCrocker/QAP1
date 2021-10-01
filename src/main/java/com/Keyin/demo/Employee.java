package com.Keyin.demo;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    static int count = 0;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        count++;
    }


    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return (this.firstName + " " + this.lastName);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return (this.salary * 12);
    }

    public double raiseSalary(double percent) {
        this.salary = this.salary + (percent/100*this.salary);
        return (this.salary);
    }

    public String toString() {
        return (getName() + " has a salary " + this.salary + " and we have " + count + " Employees");
    }

}