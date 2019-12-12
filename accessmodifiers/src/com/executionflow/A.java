package com.executionflow;

public class A {
	int n=10;
	A()
	{
		System.out.println("A-constructor");
	}
	static int m=20;
	{
		System.out.println("A-instance block");
	}
	static {
		System.out.println("A-static block");
	}
	void m1()
	{
		System.out.println("A-instance method-m1");
	}
	
	static void m2() {
		System.out.println("A-m2-static method");
	}
	static void m3()
	{
		System.out.println("A-m3-static method");
	}
	
}
