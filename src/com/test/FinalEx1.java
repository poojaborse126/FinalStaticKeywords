package com.test;

public class FinalEx1 {
	FinalEx1() {
		System.out.println("This is a default constructer  of FinalEx2");
	}

	final int a = 100;

	// this method we can not override
	final void show() {
		System.out.println(a);
	}

	void welcome() {
		System.out.println("Welcome to java by  kiran,Pune");
	}
}
