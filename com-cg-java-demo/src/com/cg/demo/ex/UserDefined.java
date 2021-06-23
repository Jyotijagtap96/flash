package com.cg.demo.ex;

class InvalidAge extends Exception {
	InvalidAge(String var) {
		super(var);
	}
}

public class UserDefined {
	public static void vote(int age) throws InvalidAge {
		if (age < 18) {
			throw new InvalidAge("u are kid");
		} else {
			System.out.println("Welcome");
			System.out.println("Plz vote");

		}
	}
	public static void main(String[] args) {
		System.out.println("hi");
		try
		{
			vote(1);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		System.out.println("Bye");
	}

}
