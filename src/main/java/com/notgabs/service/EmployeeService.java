package com.notgabs.service;

import java.util.List;

import com.notgabs.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee employee);
	public void delete(Employee employee);
}
