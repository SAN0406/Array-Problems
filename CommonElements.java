package com.array.main;

public class CommonElements {

	public static void main(String[] args) {
		// Find common Elements in two sorted array
		
		int [] arr1 = {1,2,3,4,5,6,7};
		int [] arr2 = {2,3,4,9,5,10};
		
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j =0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("The common Elements are : " + arr1[i] + " ," + arr2[j]);
				}
			}
		}

	}

}
