package com.cg.demo.ex;

import java.util.Scanner;

public class ExDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1");
		int num1=sc.nextInt();
		System.out.println("Enter 2");
		int num2=sc.nextInt();
		try
		{
			System.out.println(num1/num2);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("no");
		}
		
		
		
	}

}
