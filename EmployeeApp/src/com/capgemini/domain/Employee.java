package com.capgemini.domain;

public class Employee {
	int empId;
String empName;
double salary;
String nameOfDept;
public Employee() {
	super();
	}
public Employee(int empId, String empName, double salary, String nameOfDept) {
	super();
	this.empId=empId;
	this.empName = empName;
	this.salary = salary;
	this.nameOfDept = nameOfDept;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getNameOfDept() {
	return nameOfDept;
}
public void setNameOfDept(String nameOfDept) {
	this.nameOfDept = nameOfDept;
}


	
	
}


