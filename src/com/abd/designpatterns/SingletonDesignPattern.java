package com.abd.designpatterns;

public class SingletonDesignPattern {
	
//	static SingletonDesignPattern s = new SingletonDesignPattern(); //Eagar initialization :in this 
	//we are getting object even though we dont need so this can be overcome by Lasy initialization
	//Lazy initaialization
	
	//Lazy initaialization  example
	static SingletonDesignPattern s = null;
	
	public static void main(String args[]) {
		//magical number check
		//load the class ->Class Loader
		//Loader, link, initialize
		//Bootstrap-rt.jar, system, extension
	}
	
	
	//Private constructor
	private SingletonDesignPattern() {
		
	}
	
	//this m1() can any name like getInstance()
	static SingletonDesignPattern m1() {
		if(s==null)
			s= new SingletonDesignPattern();
		return s; 
	}
}
