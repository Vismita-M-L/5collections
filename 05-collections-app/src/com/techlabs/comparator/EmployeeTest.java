package com.techlabs.comparator;

import java.util.ArrayList;

import java.util.List;


public class EmployeeTest {
	List<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(1,"Vismita",10000))
	employees.add(new Employee(2,"Akshitha",20000))
	employees.add(new Employee(3,"Rahul",40000))
	
	Collections.sort(employees,new EmployeeBySalary());
	for(Employee employee:employees)
	
	System.out.println(employee);
	

	
}
	
	
	

}
