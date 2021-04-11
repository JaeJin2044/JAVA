package com.java.ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//HashMap 
		
		Map<Object,Object> map = new HashMap<>();
		
		map.put("이름", "이재진");
		map.put("나이",28);
		
		//값 삭제
		//map.remove(0);
		
		//값 전체 삭제
		//map.clear();
		
		//값 출력 
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		
		System.out.println(map.keySet());
		
		Set<Object> strEx = map.keySet();
		Collection<Object> values = map.values();
		
		
		for(Object str : strEx) {
			System.out.println(str);
		}
		
		
		for(Object obj : values) {
			System.out.println(obj);
		}
		
		
		
		

	}

}
