package com.techlabs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.list.Student;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("Vismita","vismita@gmail.com",3));
		students.add(new Student("Varun","varun@gmail.com",2));
		students.add(new Student("Rahul","rahul@gmail.com",1));
		students.add(new Student("Sachin","sachin@gmail.com",4));
		Collections.sort(students, new StudentByName());
		for(Student student:students)
			
			System.out.println(student);
		System.out.println("Students Alphabetical Wise:");
		
		

	}

}
