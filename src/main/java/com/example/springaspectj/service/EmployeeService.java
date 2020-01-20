package com.example.springaspectj.service;

import com.example.springaspectj.model.Employee;

public class EmployeeService {
    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee e)
    {
        this.employee=e;
    }
}
