package com.mphasis.training.proj.repos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.training.proj.pojos.Employee;

public class EmployeerepoImpl implements EmployeeRepo {
	
	List<Employee> employees=new ArrayList<>();
	public EmployeerepoImpl() {
		employees.add(new Employee(1,"shodh",234345,LocalDate.of(2019, 10, 05)));
		employees.add(new Employee(2,"shodhan",2343345,LocalDate.of(2019, 02, 05)));
		employees.add(new Employee(3,"dhshetty",122345,LocalDate.of(2017, 10, 05)));
		employees.add(new Employee(4,"shodhannnnaa",334345,LocalDate.of(2015, 02, 05)));
		employees.add(new Employee(5,"shooooo",6664345,LocalDate.of(2012, 10, 02)));
		employees.add(new Employee(6,"sapppp",44345,LocalDate.of(2011, 10, 15)));
		employees.add(new Employee(7,"shetty",664345,LocalDate.of(200, 10, 05)));
		employees.add(new Employee(8,"summana",8834345,LocalDate.of(2019, 11, 05)));
		employees.add(new Employee(9,"shravan",7734345,LocalDate.of(2016, 04, 05)));
		employees.add(new Employee(10,"Rohit",994345,LocalDate.of(2012, 10, 04)));
		
	
	}
	
	
	

	@Override
	public List<Employee> retiveAllEmployee() {
		// TODO Auto-generated method stub10
		return employees;
	}

	@Override
	public Employee retriveEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
	 employees.add(e);
		return 1;
	}

	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
