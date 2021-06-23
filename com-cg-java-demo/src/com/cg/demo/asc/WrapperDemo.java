package com.cg.demo.asc;

public class WrapperDemo {
	public static void main(String[] args) {
		//String name="jyoti";
		//int num=10;
		//Integer num2=10;
		WrapperDemo obj = new WrapperDemo();
		WrapperDemo obj2=new WrapperDemo();
		
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj==obj2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		
		
	}

}
