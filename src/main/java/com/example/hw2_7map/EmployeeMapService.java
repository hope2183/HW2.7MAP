package com.example.hw2_7map;

import java.util.Map;

public interface EmployeeMapService {

    Employee addToEmployeeBook(Integer id, Employee firstName, Employee lastName);

//    String removeFromEmployeeBook(Integer id);
//
//    String findInEmployeeBook(Integer id);

    Map<Integer, Employee> getEmployeeBook();

}
