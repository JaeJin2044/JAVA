package com.java.abs;

public class MainTest {
	
	private static final String Dog = null;

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		methodRun(dog);
		methodRun(cat);
		
		
	}
	
	public static void methodRun(Animal ani) {
		
		ani.run();
		
		if(ani instanceof Dog) {
			((Dog)(ani)).dogMethod();
		}
		
	}
	
	
}
