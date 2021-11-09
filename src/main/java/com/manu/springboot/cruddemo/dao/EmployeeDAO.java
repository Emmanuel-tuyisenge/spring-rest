package com.manu.springboot.cruddemo.dao;

import java.util.List;

import com.manu.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
