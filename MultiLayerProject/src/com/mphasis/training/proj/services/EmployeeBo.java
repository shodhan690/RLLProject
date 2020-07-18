package com.mphasis.training.proj.services;

import java.util.List;

import com.mphasis.training.proj.exceptions.BuisnessException;
import com.mphasis.training.proj.pojos.Employee;

public interface EmployeeBo {
    public List<Employee> getAllEmployee()throws BuisnessException;
    public Employee getEmployeeById(int id)throws BuisnessException;
    public int addEmployee(Employee e)throws BuisnessException;
    public int updateEmployee(Employee e)throws BuisnessException;
    public int removeEmployee(int id)throws BuisnessException;
    public List<Employee> sortEmployeeByName()throws BuisnessException;
    public List<Employee> getEmployeeByName(String name)throws BuisnessException;
    public List<Employee> getEmployeeBySalary(double salary)throws BuisnessException;
    public Employee getEmployeeWithHighestExperience()throws BuisnessException;
}
                 