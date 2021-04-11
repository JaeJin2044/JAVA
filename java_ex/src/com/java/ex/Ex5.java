package com.java.ex;

public class Ex5 extends Ex4 implements Inter{

	@Override
	public int sum(int a, int b) {
		return 0;
	}

	@Override
	void sum1() {
		System.out.println("안녕하세요");
		
	}

	@Override
	public String strMethod1() {
		return "이재진";
	}
	
	public int miNus() {
		return 1;
	}
	
	

}
