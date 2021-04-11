package com.java.abs;

public class Cat implements Animal{

	@Override
	public void run() {
		System.out.println("개는 야옹야옹 하면서 달립니다.");
		
	}

	@Override
	public void info() {
		System.out.println("나는 고양이입니다.");
		
	}

}
