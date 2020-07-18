package com.mphasis.training.proj.services;

import java.util.List;

import com.mphasis.training.proj.exceptions.BuisnessException;
import com.mphasis.training.proj.pojos.Employee;
import com.mphasis.training.proj.repos.EmployeeRepo;
import com.mphasis.training.proj.repos.EmployeerepoImpl;

public class EmployeeBoImpl implements EmployeeBo {

	EmployeeRepo employeeRepo;
    
    public EmployeeBoImpl() {
       employeeRepo=new EmployeerepoImpl();
    }
   
   @Override
   public List<Employee> getAllEmployee()throws BuisnessException{
       List<Employee> employees=employeeRepo.retiveAllEmployee();
       if(employees.isEmpty()) {
           throw new BuisnessException("No Employees Found");
       }
       return  employees;
   }
	

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Employee e)throws BuisnessException {
	 int i=0;
	 if(e.getEmpid()>0 && e.getEmpid()<999) {
		 if(e.getEname().matches("[a-zA-z]{3,10}")) {
			 if(e.getSalary()>2000 && e.getSalary()<90000) {
				 i=employeeRepo.addEmployee(e);
			 }
			 else {
				 throw new BuisnessException("invalid  Salary");
			 }}
			 else {
				 throw new BuisnessException("invalid name,name allows 3 to 10  letter");
			 }}
				 else {
					 throw new BuisnessException("invalid  Employee Id");
				 }
		 
		 
	 
		return i;
	}


	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> sortEmployeeByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeBySalary(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeWithHighestExperience() {
		// TODO Auto-generated method stub
		return null;
	}

}
