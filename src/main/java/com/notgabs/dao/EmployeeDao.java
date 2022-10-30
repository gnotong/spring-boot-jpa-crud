package com.notgabs.dao;

import java.util.List;

import com.notgabs.entity.Employee;

public interface EmployeeDao {
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee employee);
	public void delete(Employee employee);
}
