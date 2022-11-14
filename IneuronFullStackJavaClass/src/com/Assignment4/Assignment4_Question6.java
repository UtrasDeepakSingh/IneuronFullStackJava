package com.Assignment4;

import java.util.Scanner;

/*
 * WAP to implement Pangram Checking with least inbuilt methods being used.
 */


public class Assignment4_Question6 
{
	public void checkPangram(String string)
	{		
		char[] array=string.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=toUpperCase(array[i]);
		}
		
		
	algorithm :
	{
			
		
			for(char ch='A';ch<'Z';ch++)
			{
				int count=0;
				for(char temp:array)
				{
					if(ch==temp)
					{
						count++;
					}
				}
				if(count<=0)
				{
					System.out.println(string+" is not a Pangram");
					break algorithm;
				}
				
			
			}
			System.out.println(string+" is a Pangram");
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
	
	

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();
		scan.close();
		
		Assignment4_Question6 assignment4_Question6 = new Assignment4_Question6();
		assignment4_Question6.checkPangram(string);
		
	}

}
