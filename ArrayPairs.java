package com.array.main;

public class ArrayPairs {

	public static void main(String[] args) {
		// Find the pair with given sum in sorted arrray i.e if {1,2,3,4} and sum = 7
       // so ans is (3,4)
		
		int[] arr = {1,2,3,4,5,6,7};
		int sum =9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j =1;j<arr.length;j++)
			{
				if(sum==arr[i]+arr[j])
				{
					System.out.println("The Pairs are: " + arr[i] + "," + arr[j]);
					break;
				}
			}
		}
	}

}
