package com.duplicate.main;

import java.util.HashSet;
import java.util.Set;

public class Duplicate2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,3,4,5,5,6};
		
		Set <Integer> uniqueNumber = new HashSet<>();
		
		boolean isDuplicateExist = false;
		for(int i = 0;i<arr.length;i++)
		{
			if(uniqueNumber.contains(arr[i]))
			{
				isDuplicateExist = true;
				System.out.println("Duplicate Element " + arr[i]);
			}
			else
			{
				uniqueNumber.add(arr[i]);
			}
		}
		if(!isDuplicateExist)
		{
			System.out.println(-1);
		}
	}

}
