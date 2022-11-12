package com.Assignment2;

import java.util.Scanner;



/*
 * WAP to sort an array using Quick Sort Algorithm.
 */

public class Assignment2_Question2 
{
	
	
	public void quickSortAlgorithm(int [] array,int lesser,int greater) 
	
	{
		if(lesser>=greater)
			return;
		
			
		int pivot 		= array[greater];
		int leftHand 	= lesser;
		int rightHand 	= greater;
		
		while(leftHand<rightHand)
		{
			while(array[leftHand]<=pivot&&leftHand<rightHand)	//moving from left to right
			{
				leftHand++;
			}
			
			while(array[rightHand]>=pivot&&leftHand<rightHand)	//moving from right to left 
			{
				rightHand--;
			}
			
			swap(array,leftHand,rightHand);
			
		}
		swap(array,leftHand,greater);
		
		
		quickSortAlgorithm(array, lesser, leftHand-1);	//quick sort on left array of current pivot
		
		quickSortAlgorithm(array, leftHand+1, greater);	//quick sort on right array of current pivot
	
	}
	
	
	static void swap(int[] array,int first,int second)
	{
		int temp=array[first];
		array[first]=array[second];
		array[second]=temp;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = scan.nextInt();
		
		System.out.println("Enter the "+size+" Numbers");
		
		int[] array = new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		scan.close();
		
		System.out.println("User Defined Array :");
		for(int x:array)
			System.out.print(x+" ");
		System.out.println();
		
		Assignment2_Question2 assignment2_Question2 = new Assignment2_Question2();
		assignment2_Question2.quickSortAlgorithm(array, 0, array.length-1);
		
		System.out.println("Quick Sorted Array :");
		for(int x:array)
			System.out.print(x+" ");
		
		
		
		
	}

}
