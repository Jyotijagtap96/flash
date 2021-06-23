package com.cg.demo.col;

import java.util.TreeSet;

public class TreeDemo {
	public static void main(String[] args) {
		TreeSet myset = new TreeSet();
		System.out.println(myset.size());
		myset.add(10);
		myset.add(80);
		myset.add(50);
		myset.add(10);
		System.out.println(myset.size());
		System.out.println(myset);
	}

}
