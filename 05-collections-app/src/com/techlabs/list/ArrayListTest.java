package com.techlabs.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayListTest {

	public static void main(String[] args) {
		List<String> players=new ArrayList<String>();
		players.add("manav");
		players.add("rahul");
		players.add("sachin");
		System.out.println(players);
		
		Iterator<String> iterator=players.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		ListIterator<String> listiterator=players.listIterator();
		while(listiterator.hasNext())
		{
			System.out.println(listiterator.next());
		}
		while(listiterator.hasPrevious())
		{
			System.out.println(listiterator.previous());
		}
		for(String player:players)
		{
			System.out.println(player+" is playing");
		}
		

	}

	
		
	}

		
	

		
	


