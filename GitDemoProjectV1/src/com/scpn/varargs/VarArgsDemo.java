package com.scpn.varargs;

import java.util.Arrays;

public class VarArgsDemo {
	void m1() {
		System.out.println("not args");
	}
   void m1(int a) {
	   System.out.println("one args: "+a);
   }
   void m1(String s,int b) {
	   System.out.println("two args: "+s+" "+b);
   }
   void m1(int...a) {
	   System.out.println("varargs... :"+Arrays.toString(a));
   }
   void m1(String s,int...a) {
	   System.out.println("String s,int...a");
   }
   
   public static void main(String[] args) {
	VarArgsDemo v1=new VarArgsDemo();
	v1.m1();
	v1.m1(null, 10);
	v1.m1(10);
	v1.m1(10, 20);
	v1.m1(10,20,30,40,50);
	
	
}
}
