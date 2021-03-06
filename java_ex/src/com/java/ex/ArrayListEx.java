package com.java.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList
		// ArrayList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트
		// 일반적인 배열과 같은 순차리스트이다.
		// 인덱스로 내부의 객체를 관리한다는점등이 유사하지만 한번 생성되면 크기가 변하지 않는 배열과는 달리 ArrayList는 객체들이 추가되어
		// 저장 용량(capacity)을 초과한다면 자동으로 부족한 크기만큼 저장 용량(capacity)이 늘어난다는 특징을 가지고 있습니다.
		
		//ArryList 값 삽입
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> nums = new ArrayList();
		
		for (int i = 1; i <32; i++) {
			nums.add(i);
		}
		
		Collections.shuffle(nums);
		
//		
//		//ArryList 사이즈 
//		System.out.println("ArrayList Size");
//		System.out.println("list1 의 사이즈 : "+list1.size());
//		System.out.println("===============");
//		
//		//데이터 가져오는 방법 get사용 여기도 인덱스 이용
//        System.out.println("ArrayList get Data");
//        System.out.println(list1.get(3));
//    	System.out.println("===============");
//        
//        //데이터 삭제 방법 remove사용
//        System.out.println("ArrayList remove");
//        System.out.println(list1.remove(0));
//    	System.out.println("===============");
//    	
//        //데이터 수정 방법 set사용
//        System.out.println("ArrayList set");
//        list1.set(1, "이재진");
//        System.out.println("===============");
//        
//        //값이 있는지없는 확인
//        System.out.println("값 체크 ");
//        System.out.println(list1.contains("이재진"));
//        System.out.println(list1.indexOf("이재진"));
//        System.out.println("==================================");
//		
//        //for-loop 사용 ArrayList 값 출력 
//        System.out.println("for loop");
//		for(Object str : list1) {
//			System.out.println(str);
//		};
//		System.out.println("==================================");
//		
//		//iterator 통한조회
//		System.out.println("iterator");
//		Iterator iterator = list1.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println("===============");
		
	}
}
