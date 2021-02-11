package com.prince.collections;

import java.util.ArrayList;

public class ArrayListDemoBook {
	int id, quantity;
	String name, author, publisher;

	public ArrayListDemoBook(int id, int quantity, String name, String author, String publisher) {

		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	public static void main(String[] args) {
		ArrayList<ArrayListDemoBook> al = new ArrayList<>();
		ArrayListDemoBook b1 = new ArrayListDemoBook(100, 5, "maghi", "alok", "bharti");
		ArrayListDemoBook b2 = new ArrayListDemoBook(101, 6, "bhojpuri", "prince", "raj");
		ArrayListDemoBook b3 = new ArrayListDemoBook(103, 10, "english", "Shubham", "Vats");
		ArrayListDemoBook b4 = new ArrayListDemoBook(104, 15, "hindi", "Suraj", "shah");

		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);

		for (ArrayListDemoBook b : al) {
			System.out.println("ID: " + b.id + " quantity: " + b.quantity + " name: " + b.name + "  author: " + b.author
					+ "  publisher: " + b.publisher);
	 
			
		}
	}
}
