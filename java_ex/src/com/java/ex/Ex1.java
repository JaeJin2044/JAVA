package com.java.ex;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		//로또 번호 
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random()* 45)+ 1);
			
			for (int j = 0; j < i; j++) {
				
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(lotto));

	}

}
