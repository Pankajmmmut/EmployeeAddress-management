package com.assignment.EmployeeAddress.controller;

import com.assignment.EmployeeAddress.model.Employee;
import com.assignment.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    // get all employees
    @GetMapping("employees")
    public Iterable getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //get an employee by id
    @GetMapping("employee/{emId}")
    public Optional getEmployeebyId(@PathVariable Long emId){
        return employeeService.getEmployeebyId(emId);
    }

    //post an employee
    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    // update employee by id
    @PostMapping("employee/{emId}/{firstName}")
    public String updateEmployeeFirstNamebyId(@PathVariable Long emId,@PathVariable String firstName){
        return employeeService.updateEmployeeFirstNamebyId(emId,firstName);
    }
    //delete a employee by id
    @DeleteMapping("employee/{emId}")
    public String deleteAEmployeebyId(@PathVariable Long emId){
        return employeeService.deleteAEmployeebyId(emId);
    }

}
