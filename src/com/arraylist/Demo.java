package com.arraylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("Jyoti");
		al.add("Ram");
		al.add("Shiva");
		al.add("Rita");
		al.add("Rohit");
		//System.out.println(al);
		Iterator<String> its=al.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}
}
