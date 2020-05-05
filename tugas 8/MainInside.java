package com.latihan;

public class MainInside{
public static void main (String[] args){

	Test obj1=new Test();
	Test obj2=new Test();
	Test obj3=new Test();
	obj1.addCounter();
	System.out.println("Conter milik obj1="+obj1.getCounter());
	System.out.println("Conter milik obj2="+obj1.getCounter());
	System.out.println("Conter milik obj3="+obj1.getCounter());
	}
}
	