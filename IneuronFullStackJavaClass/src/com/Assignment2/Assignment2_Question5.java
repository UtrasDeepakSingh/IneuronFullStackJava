package com.Assignment2;

import java.util.Scanner;

/*
 *  WAP to sort an array using Selection Sort Algorithm.
 */
public class Assignment2_Question5 
{
	public void selectionSortAlgorithm(int[] array)
	{
		
		
		for(int i=0;i<array.length-1;i++)
		{
			int minimum = i;
			
			for(int j=i;j<array.length;j++)
			{
				if(array[minimum]>array[j])
				{
					minimum=j;
				}
			
			}
			
			int temp=array[i];
			array[i]=array[minimum];
			array[minimum]=temp;
			
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
		
		System.out.println("User Defined Array :");
		for(int x:array)
			System.out.print(x+" ");
		System.out.println();
		
		Assignment2_Question5 assignment2_Question5 = new Assignment2_Question5();
		assignment2_Question5.selectionSortAlgorithm(array);
		
		
		System.out.println("Selection Sorted Array :");
		for(int x:array)
			System.out.print(x+" ");
		

	}

}
