package ex03;

import java.util.ArrayList;

public class ArrayListEx01 {
	
	public static void main(String[] args) {
		/*
		 * 중복허용, 순서보장
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
		list.add(20);
		list.add(55);
		list.add(10);
		list.add(45);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("list ------------------");
		
		for(int num : list)
			System.out.println(num);
		System.out.println("num ------------------");
		list.remove(1);  // list[1] : 값 20을 삭제
		
		for(int num : list)
			System.out.println(num);
		
		list.add(1, 50); // ;list[1] : 값 50을 추가
		System.out.println("1, 50------------------");
		for(int num : list)
			System.out.println(num);
	}

}
