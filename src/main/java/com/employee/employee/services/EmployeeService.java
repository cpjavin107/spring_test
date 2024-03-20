package com.employee.employee.services;

import java.util.ArrayList;

import com.employee.employee.EmployeeModel;

public interface EmployeeService  {
ArrayList<EmployeeModel> getList();
String createEmp(EmployeeModel emp);
    
} 
