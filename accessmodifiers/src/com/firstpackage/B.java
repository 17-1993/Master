package com.firstpackage;

public class B extends A {
	
	void checkInstanceContext()
	{
    //direct access
	System.out.println(aDefaultI);	
	System.out.println(aprotectedI);	
	System.out.println(aPublicI);	
	//System.out.println(aPrivateI);
	
	System.out.println(aDefaultS);
	System.out.println(aprotectedS);
	System.out.println(aPublicS);
	//System.out.println(aPrivateS);
	
	}
	
	static void checkStaticContext() {
		//in static context object reference required (ORR)
		A a=new A();
		System.out.println(a.aDefaultI);	
		System.out.println(a.aprotectedI);	
		System.out.println(a.aPublicI);	
		//System.out.println(a.aPrivateI);
		
	    //direct access
		System.out.println(aDefaultS);
		System.out.println(aprotectedS);
		System.out.println(aPublicS);
		//System.out.println(aPrivateS);
		
	}
	public static void main(String[] args) {
		checkStaticContext();
		B b=new B(); //using this we can call the class A and B methods and variables
		b.checkInstanceContext();
		
		A a=new B();//using this only we can call the class A methods and variables
		//B ab=new A()// not allowed
		
	}

}
