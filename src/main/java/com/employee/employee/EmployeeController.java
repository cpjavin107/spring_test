package com.employee.employee;

import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.services.EmployeeService;
import com.employee.employee.services.EmployeeServiceHelper;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 * EmployeeController
 */
@RestController
public class EmployeeController {

EmployeeService employeeService=new EmployeeServiceHelper();
    @GetMapping("/empList")
    public ArrayList<EmployeeModel> getEmployee() {
        return employeeService.getList();
    }

    @PostMapping("/createEmp")
    public String postMethodName(@RequestBody EmployeeModel entity) {
        return employeeService.createEmp(entity);
    }
    
    
    
}