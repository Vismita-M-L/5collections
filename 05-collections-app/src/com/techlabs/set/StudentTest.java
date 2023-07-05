package com.techlabs.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Set<Student> students=new HashSet<Student>();
		Student s1=new Student("DDD","ddd@gmail.com",5);
		students.add(new Student("ABC","abc@gmail.com",1));
		students.add(new Student("AAA","aaa@gmail.com",2));
		students.add(new Student("BBB","bbb@gmail.com",3));
		students.add(new Student("CCC","ccc@gmail.com",4));
		students.add(s1);
		students.add(s1);
		
		for(Student student:students)
			System.out.println(student);
		

	}

}
