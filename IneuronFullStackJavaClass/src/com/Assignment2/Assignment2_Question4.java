package com.Assignment2;

import java.util.Scanner;

/*
 * WAP to sort an array using Merge Sort Algorithm.
 */


public class Assignment2_Question4 
{
	
	
	public void mergeSortAlgorithm(int[] array)
	{
		if(array.length<=1)
			return;
		
		int middleIndex = array.length/2;
		int[] leftHandArray = new int[middleIndex];
		int[] rightHandArray = new int[array.length-middleIndex];
		
		for(int i=0;i<middleIndex;i++)
			leftHandArray[i]=array[i];
		
		for(int j=middleIndex;j<array.length;j++)
			rightHandArray[j-middleIndex] = array[j];
		
		mergeSortAlgorithm(leftHandArray);
		mergeSortAlgorithm(rightHandArray);
		
		merge(array,leftHandArray,rightHandArray);		//calling merge method
		
		
	}
	
	public void merge(int[]array,int[] leftArray,int[]rightArray)
	{
		int i=0,j=0,k=0;
		
		while(i<leftArray.length&&j<rightArray.length)
		{
			if(leftArray[i]<=rightArray[j])		//comparing left array with right
			{
				array[k]=leftArray[i];
				i++;
			}
			else								//comparing right array with right
			{
				array[k]=rightArray[j];
				j++;
			}
			
			k++;
		}
		
		while(i<leftArray.length)			//if element is left in left Array
		{
			array[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArray.length)			//if element is left in right Array
		{
			array[k]=rightArray[j];
			j++;
			k++;
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
		
		System.out.println("Unsorted Array:");
		for(int x:array)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		Assignment2_Question4 assignment2_Question4 =new Assignment2_Question4();
		assignment2_Question4.mergeSortAlgorithm(array);
		
		System.out.println("Merge Sort Array:");
		for(int x:array)
		{
			System.out.print(x+" ");
		}
		
		

	}
	
	
	

}
