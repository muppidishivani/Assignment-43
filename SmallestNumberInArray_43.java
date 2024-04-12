package com.web.java;

import java.util.Scanner;

public class SmallestNumberInArray_43 {

	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("enter the number of elements ");
	        int n = scanner.nextInt();
	        
	       
	        int[] nums = new int[n];
	        
	       
	        System.out.println("enter the elements");
	        for (int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }
	        
	        
	        int max= nums[0];
	        
	      
	        for (int i = 1; i < n; i++) {
	            if (nums[i] <max) {
	                max= nums[i];
	            }
	        }
	        System.out.println("The smallest element in the array is="+max);

	        
	}
}
	        
	     