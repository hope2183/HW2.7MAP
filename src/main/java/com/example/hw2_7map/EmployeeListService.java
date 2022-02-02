package com.example.hw2_7map;

import java.util.Map;

public interface EmployeeListService {

    String addToEmployeeList(Integer id, String firstName, String lastName);

    String removeFromEmployeeList(Integer id);

    String findInEmployeeList(Integer id);

    Map<Integer, String> getEmployeeList();

}
