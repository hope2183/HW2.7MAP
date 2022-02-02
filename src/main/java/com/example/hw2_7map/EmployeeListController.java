package com.example.hw2_7map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee-list")

public class EmployeeListController {
    private final EmployeeListService employeeListService;

    public EmployeeListController(EmployeeListService employeeListService) {
        this.employeeListService = employeeListService;
    }


    @GetMapping("/employee-list/")
    public String welcome() {
        return "Welcome to employee world!";
    }

    @GetMapping("/add")
    public String addToEmployeeList(@RequestParam("id") Integer id, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeListService.addToEmployeeList(id, firstName, lastName);
    }

    @GetMapping("/remove")
    public String removeFromEmployeeList(@RequestParam("id") Integer id) {
        return employeeListService.removeFromEmployeeList(id);
    }


    @GetMapping("/find")
    public String findInEmployeeList(@RequestParam("id") Integer id) {
        return employeeListService.findInEmployeeList(id);
    }

    @GetMapping("/printList")
    public Map<Integer, String> getEmployeeList() {
        return employeeListService.getEmployeeList();
    }

}
