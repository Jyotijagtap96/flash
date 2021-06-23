package com.cg.demo.col;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		
	
	HashSet myset = new HashSet();
	System.out.println(myset.size());
	myset.add("ABC");
	myset.add(20.75);
	myset.add(20);
	myset.add(10);
	System.out.println(myset.size());
	System.out.println(myset);
	}

}
