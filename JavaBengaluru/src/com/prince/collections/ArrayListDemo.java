package com.prince.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("suraj");
		al.add("prince");
		al.add("Shubham");
		al.add("alok");
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("Traversing ArrayList through iterator: ");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("ArrayList: "+al);
	}
	
}
