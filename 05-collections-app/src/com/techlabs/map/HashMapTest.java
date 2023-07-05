package com.techlabs.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.add(1, "vismita");
		map.add(2, "Druva");
		map.add(4, "Varun");
		map.add(1, "Mrinal");
		
		System.out.println(map);
		System.out.println(map.get(3));
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		for(Map.Entry<Integer,String> entry:set)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
