package com.test;

public class FinalExTest  extends FinalEx1 { 
	 // compile time error because final method cannot override 
	 void show() { 
	  System.out.println("This is method of FinalExTest"); 
	 } 
	 
	 public static void main(String[] args) { 
	  FinalEx1 finalEx1 = new FinalEx1(); 
	  finalEx1.show(); 
	 }

}
