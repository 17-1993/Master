package com.firstpackage;

public class C {
	void checkInstanceContext()
	{
    A a=new A();
		
	System.out.println(a.aDefaultI);	
	System.out.println(a.aprotectedI);	
	System.out.println(a.aPublicI);	
	//System.out.println(aPrivateI);//not allowed
	
	
	//using class name we can call the the static variables and methods
	System.out.println(A.aDefaultS);
	System.out.println(A.aprotectedS);
	System.out.println(A.aPublicS);
	//System.out.println(aPrivateS);
	
	}
	
	static void checkStaticContext() {
		//in static context object reference required (ORR)
		A a=new A();
		System.out.println(a.aDefaultI);	
		System.out.println(a.aprotectedI);	
		System.out.println(a.aPublicI);	
		//System.out.println(a.aPrivateI);
		
		//non child class...not direct access
		System.out.println(A.aDefaultS);
		System.out.println(A.aprotectedS);
		System.out.println(A.aPublicS);
		//System.out.println(aPrivateS);
		
	}

}
