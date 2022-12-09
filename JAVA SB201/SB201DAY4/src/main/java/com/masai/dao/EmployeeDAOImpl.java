package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {

        Employee emp = null;

        EntityManager em = EMUtil.provideEntityManager();

        
        
        em.getTransaction().begin();
        em.persist(employee);
        emp = em.find(Employee.class, employee.getEmpId());
        em.getTransaction().commit();
        em.close();
        return emp;
    }

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp= null;
		
		EntityManager em=EMUtil.provideEntityManager();
		emp=em.find(Employee.class, empId);
		em.close();
		
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		emp=em.find(Employee.class, empId);
		
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();
		
		em.close();

		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Employee emp= null;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		
		emp=em.find(Employee.class,employee.getEmpId());
		 
		em.getTransaction().begin();
		
		em.merge(employee);
		
		em.getTransaction().commit();
		
		em.close();
		
		return emp;
		
	}

}
