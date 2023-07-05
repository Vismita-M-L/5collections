package com.techlabs.list;

import java.awt.List;
import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		
		students.add(new Student("Vismita","vismita@gmail.com",1));
		students.add(new Student("Varun","varun@gmail.com",2));
		students.add(new Student("Rahul","rahul@gmail.com",3));
		students.add(new Student("Sachin","sachin@gmail.com",4));
		
		System.out.println("Number of students added so far:"+students.size());
		
		for(Student student:students)
		
			System.out.println(student);
		System.out.println("Student at 2 index:"+students.get(2));
		
		
		
		
	}

}
