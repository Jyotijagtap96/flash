package com.cg.demo.abs;

public class PolyDemo {
	public int add(int i,int j)
	{
		return i+j;
		
	}
	public int add(int i,int j,int k)
	{
		return i+j+k;
	}
	public int add(int i,int j,int k,int p)
	{
		return i+j+k+p;
	}
	public static void main(String[] args) {
		PolyDemo polyDemo = new PolyDemo();
		System.out.println(polyDemo.add(10,20));
		System.out.println(polyDemo.add(10,20,30));
		System.out.println(polyDemo.add(10,20,30,40));

		
	}
	

}
