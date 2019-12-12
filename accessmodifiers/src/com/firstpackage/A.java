package com.firstpackage;

public class A {
	//instance variable
	int aDefaultI;
	private int aPrivateI;
	protected int aprotectedI;
	public int aPublicI;
	
	//static variable
	
	static int aDefaultS;
	private static int aPrivateS;
	protected static int aprotectedS;
	public static int aPublicS;
	
	//instance methods
	void mDefaultI() {
		System.out.println("Default instance");
	}
	private void mPrivateI() {
		System.out.println("Default instance");
	}
	protected void mProtectedI() {
		System.out.println("Default instance");
	}
	public void mPublicI() {
		System.out.println("Default instance");
	}
	
	//static methods
	static void mDefaultS() {
		System.out.println("Default instance");
	}
	static private void mPrivateS() {
		System.out.println("Default instance");
	}
	static protected void mProtectedS() {
		System.out.println("Default instance");
	}
	static public void mPublicS() {
		System.out.println("Default instance");
	}
	
}