package com.java.ex;

public class MainTest {

	public static void main(String[] args) {
		String a = "이재진";
		System.out.println(a.toString());
		a += "김상혁";
		System.out.println(a);
		
		StringBuilder str1 = new StringBuilder("이순신");
		
		str1.append("훌륭하신 분입니다");
		str1.insert(0, "조선시대의 ");
		str1.delete(0, 1);
		
		System.out.println(str1);
		
		int[] iArr = {1,2,3,4};
		
		System.out.println(iArr[0]);
		
		
	}

}
