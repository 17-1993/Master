package com.executionflow;

public class B extends A{
	int p=10;
	static int q=20;
	
	B(){
		System.out.println("B-constructor");
	}
	{
		System.out.println("B-instance block");
	}
	static {
		System.out.println("B-static block");
	}
	void m1()
	{
		System.out.println("B-m1-instance method");
	}
	
	static void m2() {
		System.out.println("B-m2-static method");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		   //A a=new A();
		 A b=new B();
		 b.m2();
		 b.m1();
		 b.m3();
		
		
	}

}
