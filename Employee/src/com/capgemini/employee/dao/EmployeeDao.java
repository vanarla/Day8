package com.capgemini.employee.dao;

import java.util.List;

import com.capgemini.employee.model.Employee;

public interface EmployeeDao {

	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(int employeeId);

	public boolean deleteEmployee(int employeeId);

	public boolean addEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

}
