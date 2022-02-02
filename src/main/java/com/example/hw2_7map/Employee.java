package com.example.hw2_7map;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {

        return this.lastName;
    }


    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}