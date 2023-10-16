package com.practice.main;

public class SubArraySum {

	public static void main(String[] args) {
		int [] arr = {1,2,3,7,5};
		int n = 5;
		int s = 12;
		
		for(int i = 0; i<arr.length;i++)
	     {
		      for(int j =1;j<arr.length;j++)
		      {
		    	  if(arr[i]+arr[j]==s)
		    	  {
		    		  System.out.print(i + "," + j);
		    	  }
		      }
	     }
	}

}
