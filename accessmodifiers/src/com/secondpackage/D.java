package com.secondpackage;

import com.firstpackage.A;
public class D extends A{
	
	void checkInstanceContext()
	{	
	//System.out.println(aDefaultI);		
	System.out.println(aprotectedI);	
	System.out.println(aPublicI);	
	//System.out.println(aPrivateI);
	
	//System.out.println(aDefaultS);
	System.out.println(aprotectedS);
	System.out.println(aPublicS);
	//System.out.println(aPrivateS);
	
	}
	
	static void checkStaticContext() {
		//in static context object reference required (ORR)
		A a=new A();
		D d=new D();
		//System.out.println(a.aDefaultI);
		//System.out.println(a.aprotectedI);
		System.out.println(d.aprotectedI);//instance variable in static context...required to create the object 
		                                  //of child class then only possible to access
		System.out.println(a.aPublicI);	
		//System.out.println(a.aPrivateI);
		
		
		//System.out.println(aDefaultS);
		System.out.println(aprotectedS);
		System.out.println(aPublicS);
		//System.out.println(aPrivateS);
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.mPublicI();
	    A.mPublicS();
	    A.mProtectedS();
	    
		D d=new D();
		d.mProtectedI();
	
	}

}
