package com.Assignment4;

import java.util.Scanner;


/*
 *  WAP to remove Duplicates from a String.
 */

public class Assignment4_Question1 
{
	
	public void removeDuplicates(String string)
	{
		String noSpaceString = removeSpaces(string);
		
		
		char[] charArray = noSpaceString.toCharArray();	//conversion to char Array
		
		
		noSpaceString="";								//re using noSpaceString variable
		
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=0;j<charArray.length;j++)
			{
				if(i>j)
				{
					if(charArray[j]==charArray[i])
					{
						break;
					}
				}
				else if(i==j)
				{
					noSpaceString+=charArray[i];
					break;
				}
			}
		}
		
		System.out.println("String without Duplicate Characters is ");
		System.out.println(noSpaceString);
		
	}
	
	
	public static String removeSpaces(String string)
	{	
		String noSpaceString="";
		char[] charArray = string.toCharArray();
		
		
		
		for(char ch:charArray)
		{
			if(ch!=' ')
			{
				noSpaceString+=ch;
			}
		}
		
	
		
		
		
		return noSpaceString;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();
		scan.close();
		
		Assignment4_Question1 assignment4_Question1 =new Assignment4_Question1 ();
		assignment4_Question1.removeDuplicates(string);
			
		
	}

}
