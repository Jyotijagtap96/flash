package com.cg.demo.method;

public class Employee {
	int id;
    String name;
    double salary;
    public Employee()
   {
    	super();
   }
   // Employee(int id,String name)
    //{
    	//this.id=id;
    	//this.name=name;
   // }
    public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

    


    
