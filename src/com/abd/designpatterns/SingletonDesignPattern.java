package com.abd.designpatterns;

public class SingletonDesignPattern {
	
	static SingletonDesignPattern s = new SingletonDesignPattern();
	//Private constructor
	private SingletonDesignPattern() {
		
	}
	
	//
	static SingletonDesignPattern m1() {
		return s;
	}
}
