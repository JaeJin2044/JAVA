package com.java.abs;

public class Dog implements Animal{

	@Override
	public void run() {
		System.out.println("나는 멍멍하면서 달립니다.");
		
	}

	@Override
	public void info() {
		System.out.println("저는 개입니다.");
	}
	
	public void dogMethod() {
		System.out.println("개만의 유일한 메서드");
	}

}
