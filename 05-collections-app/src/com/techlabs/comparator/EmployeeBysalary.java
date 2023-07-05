package com.techlabs.comparator;

import java.util.Comparator;

public class EmployeeBysalary implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		if(employee1.getSalary()>employee2.getSalary())
		return 1;
		if(employee1.getSalary()<employee2.getSalary())
			return -1;
			else
				return 0;
	}
	
	

}
