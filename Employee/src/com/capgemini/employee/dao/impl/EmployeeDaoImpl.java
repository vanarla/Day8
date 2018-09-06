package com.capgemini.employee.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employee.dao.EmployeeDao;
import com.capgemini.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> findAllEmployees() {
		return null;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		return null;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addEmployee(Employee employee) {

		return employees.add(employee);

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return null;
	}

}
