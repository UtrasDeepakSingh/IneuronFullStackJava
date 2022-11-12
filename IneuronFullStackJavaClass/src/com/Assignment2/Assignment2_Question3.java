package com.Assignment2;

import java.util.Scanner;

/*
 * WAP to sort an array using Bubble Sort Algorithm.
 */

public class Assignment2_Question3 
{
	
	
	public void bubbleSortAlgorithm(int [] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j-1]>array[j])
				{
					int temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
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
		
		
		System.out.println("Unsorted Array :");
		for(int x:array)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		Assignment2_Question3 assignment2_Question3 = new Assignment2_Question3();
		assignment2_Question3.bubbleSortAlgorithm(array);
		
		System.out.println("Bubble Sorted Array :");
		for(int x:array)
		{
			System.out.print(x+" ");
		}
		


	}

}
