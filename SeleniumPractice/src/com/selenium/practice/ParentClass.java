package com.selenium.practice;

public class ParentClass {

	public static void main(String[] args) 
	{
		System.out.println("i am in parent class");
		ChildClass obj = new ChildClass();
		obj.method1();
			
		System.out.println("i am back to parent class");
	}

}
