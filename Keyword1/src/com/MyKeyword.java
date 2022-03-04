package com;

public class MyKeyword extends Exception {

	public MyKeyword(String s) 
	 { 
	 super(s); 
	 } 
	} 
	class MyKeyword1
	{ 
	 public static void main(String args[]) 
	 { 
	 try
	 { 
	 throw new MyKeyword("temp"); 
	 } 
	 catch (MyKeyword ex) 
	 { 
	 System.out.println("Caught"); 
	 System.out.println(ex.getMessage());
	 }
	 }
	}