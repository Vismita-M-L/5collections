package com.techlabs.comparator;

import java.util.Comparator;

public class StudentByName implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getName().compareTo(student2.getName())<0);
		return 1;
		else
		    if(student1.getName().compareTo(student2.getName())>0);
		return -1;
		else
			return 0;
	}
	

}
