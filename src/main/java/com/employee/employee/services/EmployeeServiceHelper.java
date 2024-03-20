package com.employee.employee.services;

import java.util.ArrayList;

import com.employee.employee.EmployeeModel;

public class EmployeeServiceHelper  implements EmployeeService{

ArrayList<EmployeeModel> empList=new ArrayList<>();

    @Override
    public ArrayList<EmployeeModel> getList() {
   return empList;
    }

    @Override
    public String createEmp(EmployeeModel emp) {
      empList.add(emp);
        return "save data";
    }

    
    
}
