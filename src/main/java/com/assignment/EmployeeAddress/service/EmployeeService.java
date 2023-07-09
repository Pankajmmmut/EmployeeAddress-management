package com.assignment.EmployeeAddress.service;

import com.assignment.EmployeeAddress.model.Employee;
import com.assignment.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;
    public Iterable getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional getEmployeebyId(Long emId) {
        return employeeRepo.findById(emId);
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "An employee added.";
    }

    public String updateEmployeeFirstNamebyId(Long emId,String firstName) {
        Optional<Employee> employee=employeeRepo.findById(emId);
        if(employee.isPresent()){
            Employee employee1=employee.get();
            employee1.setEmFirstName(firstName);
            employeeRepo.save(employee1);
            return "updated";
        }
        return "not able update.";
    }

    public String deleteAEmployeebyId(Long emId) {
        employeeRepo.deleteById(emId);
        return "deleted";
    }
}
