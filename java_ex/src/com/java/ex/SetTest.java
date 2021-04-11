package com.java.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> ex1 = new HashSet<String>();
		List list = new ArrayList();
		Ex5 ex5 = new Ex5();
		
		list.add(1);
		list.add("이재진");
		list.add(null);
		list.add(ex5);
		

		for(Object exObj : list) {
			if(exObj == ex5) {
				System.out.println("하이여");
			}
			System.out.println(exObj);
			
		}
		
		System.out.println("=======================");
		
		Iterator iter1 = list.iterator();  
		
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		ex1.add("이재진");
		ex1.add("dd");
		ex1.add("김건모");
		ex1.add("이승철");
		ex1.add("소녀시대");
		
		Iterator<String> iter = ex1.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}
}
