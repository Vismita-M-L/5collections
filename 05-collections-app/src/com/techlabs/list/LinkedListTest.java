package com.techlabs.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> players = new LinkedList<String>();
		players.add("Virat");
		players.add("Scahin");
		players.add("Dravid");
		players.add("Rahul");
		
		 players.addFirst("Shushant");
		 System.out.println(players);
		 
		 players.addLast("Shushant");
		 System.out.println(players);
		 
		 

				 
	}

}
