package com.Assignment4;

import java.util.Scanner;

/*
 * WAP to implement Anagram Checking least inbuilt methods being used.

 */


public class Assignment4_Question5 
{
	
	public void CheckAnagram(String string1,String string2)
	{
		boolean isAnagram=true;
		
		char[] array1=string1.toCharArray(),array2=string2.toCharArray();
		
		algorithm:
		{
			if(array1.length!=array2.length)	//break if length are not same
			{
				isAnagram=false;
				break algorithm;
			}
			
			
			for(int i=0;i<array1.length;i++)
			{
				array1[i]=toUpperCase(array1[i]);			//converting to upper case
				array2[i]=toUpperCase(array2[i]);
				
			}
			
			array1=sortArray(array1);						//sorting the Arrays
			array2=sortArray(array2);
			
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]!=array2[i])
				{
					isAnagram=false;
					break algorithm;
				}
			}
			
			System.out.println(string1+" & "+string2+" are Anagram");
			
			
			
		
		}
		
		
		if(!isAnagram)
		{
			System.out.println(string1+" & "+string2+" are not Anagram");
		}
		
		
		
		
	}
	
		
	public static char toUpperCase(char ch)
	{
		if((ch>=97&&ch<=122))			
		{
			return ch=(char)(ch-32);
		}
		
		return ch;
		
	}
	
	
	
	public static char[] sortArray(char[] array1)
	{
		for(int i=0;i<array1.length-1;i++)
		{
			for(int j=1;j<array1.length;j++)
			{
				if(array1[j-1]>array1[j])
				{
					char temp = array1[j-1];
					array1[j-1]=array1[j];
					array1[j]=temp;
				}
			}
		}
		return array1;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String string1 = scan.next();
		
		System.out.println("Enter the second String");
		String string2 = scan.next();
		
		scan.close();
		
		Assignment4_Question5 assignment4_Question5  = new Assignment4_Question5();
		assignment4_Question5.CheckAnagram(string1, string2);
		
	}

}
