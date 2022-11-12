package com.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to check whether an array is a subset of another array.
 */

public class Assignment2_Question6 
{
	public void subsetOrNot(int []parent,int[]subset)
	{ 
		boolean isSubset=true;
		
		Arrays.parallelSort(parent);		//sorting both arrays
		Arrays.parallelSort(subset);
	
		for(int x :subset)
		{
			if(Arrays.binarySearch(parent, x)<0)		//using binary search to search for key
			{
				isSubset=false;
				break;
			}
			
		}
		if(isSubset)
		{
			System.out.println("Subset Array is a subset of Parent Array");
		}
		else 
		{
			System.out.println("Subset Array is Not a Ssubset of Parent Array");
		}
	}
	

	public static void main(String[] args) 
	{
		int[] array;
		int[] subarray;
		
		Scanner scan = new Scanner(System.in);
		{
			
			System.out.println("Enter the Size of the Parent Array");
			int size = scan.nextInt();
		
			System.out.println("Enter the "+size+" Numbers");
		
			array = new int[size];
		
			for(int i=0;i<size;i++)
			{
				array[i]=scan.nextInt();
			}
			
		}
		
		{	
			System.out.println("Enter the Size of the subset Array");
			int subsize = scan.nextInt();
		
			System.out.println("Enter the "+subsize+" Numbers");
		
			subarray = new int[subsize];
		
			for(int i=0;i<subsize;i++)
			{
				subarray[i]=scan.nextInt();
			}
		
		}
		scan.close();
		
		System.out.println("Parent Set Array :");
		for(int x:array)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("SubSet Array :");
		for(int x:subarray)
			System.out.print(x+" ");
		System.out.println();
		

		Assignment2_Question6 assignment2_Question6 = new Assignment2_Question6 ();
		assignment2_Question6.subsetOrNot(array, subarray);
		
		

		
		

	}

}
