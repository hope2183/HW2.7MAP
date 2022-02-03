package com.example.hw2_7map;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service

public class EmployeeMapServiceImpl implements EmployeeMapService {
    private Map<Integer, Employee> employeeBook;

    public EmployeeMapServiceImpl() {
        employeeBook = new HashMap<>();
    }

    @Override
    public Employee addToEmployeeBook(Integer id, Employee firstName, Employee lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        if (employeeBook.containsKey(id)) {
            throw new EmployeeAlreadyExistsException("Employee with ID " + id + " already exists!");
        } else if (employeeBook.containsValue(newEmployee)) {
            throw new EmployeeAlreadyExistsException("Employee " + newEmployee + " already exists!");
        }
        employeeBook.put(id, newEmployee);
        //  return ("Employee: ID " + id + ", " + newEmployee + " successfully added");
        return newEmployee;
    }


    //    @Override
//    public String removeFromEmployeeBook(Integer id) {
//
//        if (employeeBook.containsKey(id)) {
//            String deletedEmployee = employeeBook.remove(id);
//            return "Employee " + deletedEmployee + " removed.";
//        }
//        throw new EmployeeDoesNotExistException("Employee does not exist!");
//    }
//
//    @Override
//    public String findInEmployeeBook(Integer id) {
//        if (employeeBook.containsKey(id)) {
//            String foundEmployee = employeeBook.get(id);
//            return "EMPLOYEE " + foundEmployee + " is in the list.";
//        }
//        throw new EmployeeDoesNotExistException("Employee with ID: " + id + " does not exist!");
//    }
//
    @Override
    public Map<Integer, Employee> getEmployeeBook() {
        if (employeeBook.isEmpty()) {
            throw new EmployeeBookIsEmptyException("EMPLOYEE LIST IS EMPTY!");
        }
        return employeeBook;
    }

}
