package com.arraylist.main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(45);
		list.add(18);
		list.add(07);
		
		System.out.println("The List of Numbers are : " + list.get(0));
		
		
		System.out.println(list.contains(22));

		
	}

}
