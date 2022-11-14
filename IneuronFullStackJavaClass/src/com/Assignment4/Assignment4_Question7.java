package com.Assignment4;

import java.util.Scanner;

/*
 * WAP to find if String contains all unique characters.
 */

public class Assignment4_Question7 
{
	
	public void checkUniqueCharacters(String string)
	{
		char[] array = string.toCharArray();
		
		boolean isunique=true;
		
		for(int i=0;i<array.length-1;i++)
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					isunique=false;
					break;
				}
				
			}
		if(isunique)
			System.out.println("Characters of string "+string+" are unique");
		else
			System.out.println("Characters of string "+string+" are not unique");
		
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();
		scan.close();
		
		string=Assignment4_Question1.removeSpaces(string);		//calling static method for removing spaces
		
		Assignment4_Question7 assignment4_Question7 = new Assignment4_Question7();
		assignment4_Question7.checkUniqueCharacters(string);		
		
	}

}
