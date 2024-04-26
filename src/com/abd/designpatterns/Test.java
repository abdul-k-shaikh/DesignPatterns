package com.abd.designpatterns;

public class Test {
	public static void main(String args[]) {
		SingletonDesignPattern s = SingletonDesignPattern.m1();
		SingletonDesignPattern s1 = SingletonDesignPattern.m1();
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		
	}
}
