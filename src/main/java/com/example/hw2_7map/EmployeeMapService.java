package com.example.hw2_7map;

import java.util.Map;

public interface EmployeeMapService {

    Employee addToEmployeeBook(Integer id, String firstName, String lastName);

    Employee removeFromEmployeeBook(Integer id);

    Employee findInEmployeeBook(Integer id);

    Map<Integer,Employee> getEmployeeBook();

}
