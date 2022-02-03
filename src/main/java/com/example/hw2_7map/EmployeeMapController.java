package com.example.hw2_7map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee-list")

public class EmployeeMapController {
    private final EmployeeMapService employeeMapService;

    public EmployeeMapController(EmployeeMapService employeeMapService) {
        this.employeeMapService = employeeMapService;
    }

    @GetMapping("/employee-list/")
    public String welcome() {
        return "Welcome to employee world!";
    }

    @GetMapping("/add")
    public String addToEmployeeBook(@RequestParam("id") Integer id, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
    //employeeMapService.addToEmployeeBook(id, firstName, lastName);
        return "Employee: ID " + id+" "+employeeMapService.addToEmployeeBook(id,firstName,lastName)+ " successfully added";

    }
    @GetMapping("/remove")
    public String removeFromEmployeeList(@RequestParam("id") Integer id) {
        return "EMPLOYEE: ID "+id+" "+employeeMapService.removeFromEmployeeBook(id)+" removed.";
    }


    @GetMapping("/find")
    public String findInEmployeeList(@RequestParam("id") Integer id) {
        return "EMPLOYEE: ID"+id+" "+employeeMapService.findInEmployeeBook(id);
    }

    @GetMapping("/printList")
    public Map<Integer, Employee> getEmployeeBook() {
        return employeeMapService.getEmployeeBook();

    }

}
