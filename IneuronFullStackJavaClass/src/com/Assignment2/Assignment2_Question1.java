package com.Assignment2;

import java.util.Scanner;


/*
 * WAP to find the Duplicates present in an array.
 */

public class Assignment2_Question1 
{
			
	public void duplicateAlgorithm(int [] array)
	{
		System.out.println("Dulpicate Elements Are Given Below :");
		int counter;
		for(int i=0;i<array.length;i++)
		{	
			counter=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					if(i<j)			//For Testing Forward Elements
					{
						counter++;
					}
					else if(i>j)	//For Already Tested Elements
					{
						break;
					}
				}	
			}
			if(counter>0)
			{
				System.out.print(array[i]+" ");
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
		System.out.println("User Defined Array :");
		for(int x:array)
			System.out.print(x+" ");
		System.out.println();
		
		Assignment2_Question1 assignment2_Question1 = new Assignment2_Question1();
		
		assignment2_Question1.duplicateAlgorithm(array);
		
	}
	
	

}
