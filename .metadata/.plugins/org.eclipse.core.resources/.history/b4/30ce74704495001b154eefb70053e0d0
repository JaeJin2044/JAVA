package com.java.ex;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		
		
		int[] intSort = {30,34,11,3,5,-1,34,100,11,23,30,44,55};
		int tmp = 0;

		for (int i = 0; i < intSort.length; i++) {
			
			for (int j = 0; j < intSort.length-1; j++) {
				
				if(intSort[j] > intSort[j+1]) {
					tmp = intSort[j];
					intSort[j] = intSort[j+1];
					intSort[j+1] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(intSort));

	}

}
