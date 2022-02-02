package com.example.hw2_7map;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service

public class EmployeeListServiceImpl implements EmployeeListService {
    Map<Integer, String> employeeList;

    public EmployeeListServiceImpl() {
        employeeList = new HashMap<>();
    }

    @Override
    public String addToEmployeeList(Integer id, String firstName, String lastName) {
        String newEmployee = firstName + lastName;
        if (employeeList.containsKey(id)) {
            throw new EmployeeAlreadyExistsException("Employee with ID " + id + " already exists!");
        } else if (employeeList.containsValue(newEmployee)) {
            throw new EmployeeAlreadyExistsException("Employee " + newEmployee + " already exists!");
        }
        employeeList.put(id, newEmployee);
        return ("Employee: ID " + id + ", " + newEmployee + " successfully added");
    }

    @Override
    public String removeFromEmployeeList(Integer id) {

        if (employeeList.containsKey(id)) {
            String deletedEmployee = employeeList.remove(id);
            return "Employee " + deletedEmployee + " removed.";
        }
        throw new EmployeeDoesNotExistException("Employee does not exist!");
    }

    @Override
    public String findInEmployeeList(Integer id) {
        if (employeeList.containsKey(id)) {
            String foundEmployee = employeeList.get(id);
            return "EMPLOYEE " + foundEmployee + " is in the list.";
        }
        throw new EmployeeDoesNotExistException("Employee with ID: " + id + " does not exist!");
    }

    @Override
    public Map<Integer, String> getEmployeeList() {
        if (employeeList.isEmpty()) {
            throw new EmployeeListIsEmptyException("EMPLOYEE LIST IS EMPTY!");
        }
        return employeeList;
    }

}
