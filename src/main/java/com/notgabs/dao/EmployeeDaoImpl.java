package com.notgabs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notgabs.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EntityManager em;

	@Override
	public List<Employee> findAll() {
		return em.createQuery("from Employee").getResultList();
	}

	@Override
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}

	@Override
	public Employee save(Employee employee) {
		Employee theEmployee = em.merge(employee);
		return theEmployee;
	}

	@Override
	public void delete(Employee employee) {
		em.remove(employee);
	}

}
