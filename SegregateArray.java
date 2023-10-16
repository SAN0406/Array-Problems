package com.array.main;

import java.util.Arrays;

public class SegregateArray {

	public static void main(String[] args) {
		//Segregate '0' on left side and '1' on right side
		
		int[] arr = {0,1,0,1,0,1,0,1,0,1};
		int temp =0;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
