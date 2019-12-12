package com.executionflow;

import java.lang.reflect.Field;

public class PrivateAccess {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Demo d=new Demo();
		Demo d1=new Demo();
		
	
		Field[] fields=d.getClass().getDeclaredFields();
		for(Field field:fields) {
			field.setAccessible(true);
			field.set(d,30);
			
		}
		d.m1();//we can't change the value of private variable for particular object reference
		       //reflection mechanism
	//	d1.m1();
		
	}
	
}

class Demo{
	private int number=10;
	//int m=20;
	void m1(){
		System.out.println(number);
		//System.out.println(m);
	}
}