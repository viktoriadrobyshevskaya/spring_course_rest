package com.zaurtregulov.spring.rest.dao;

import com.zaurtregulov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmp(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmp(int id);

}
