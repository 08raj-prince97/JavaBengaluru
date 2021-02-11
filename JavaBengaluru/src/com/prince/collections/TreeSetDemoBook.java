package com.prince.collections;

import java.util.*;

public class TreeSetDemoBook {
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<Book>();
		Book b1 = new Book(534, "magahi", "Alok", "bharti", 76);
		Book b2 = new Book(236, "hindi", "suraj", "shah", 37);
		Book b3 = new Book(999, "english", "shubham", "vats", 65);
		Book b4 = new Book(5466, "bhojpuri", "prince", "raj", 645);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		for (Book b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}

class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {  
	    if(quantity>b.quantity){  
	        return 1;  
	    }else if(quantity<b.quantity){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	    
	}  
}