package com.secondpackage;

import com.firstpackage.A;
public class E {
	void checkInstanceContext()
	{
		
	A a=new A();
	//System.out.println(a.aDefaultI);	
	//System.out.println(a.aprotectedI);	
	//System.out.println(a.aPublicI);	
	//System.out.println(aPrivateI);
	
	//System.out.println(A.aDefaultS);
	//System.out.println(A.aprotectedS);
	System.out.println(A.aPublicS);
	//System.out.println(aPrivateS);
	
	}
	
	static void checkStaticContext() {
		//in static context object reference required (ORR)
		A a=new A();
		//System.out.println(a.aDefaultI);	
		//System.out.println(a.aprotectedI);	
		System.out.println(a.aPublicI);	
		//System.out.println(a.aPrivateI);
		
	   
		//System.out.println(A.aDefaultS);
		//System.out.println(A.aprotectedS);
		//direct access
		System.out.println(A.aPublicS);
		//System.out.println(aPrivateS);
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.mPublicI();
		A.mPublicS();
		
	}

}
