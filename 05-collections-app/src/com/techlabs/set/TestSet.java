package com.techlabs.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> names=new HashSet<String>();
		names.add("Pradeep");
		names.add("Sukanya");
		names.add("Rahul");
		names.add("Mantosh");
		
		System.out.println(names.size());
		System.out.println(names);
		}

}
