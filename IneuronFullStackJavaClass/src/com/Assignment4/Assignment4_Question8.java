package com.Assignment4;

import java.util.Scanner;

/*
 * WAP to find the maximum occurring character in a String.
 */

public class Assignment4_Question8 
{
	
	public void maximumOccurringCharacter(String string)
	{
		
		char[] array = string.toCharArray();
		
		char maxCharacter=array[0];
		int occurance=0;
		
		for(int i=0;i<array.length;i++)
		{
			int temp =0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					temp++;
				}
				
			}
			if(temp>occurance)
			{
				maxCharacter=array[i];
				occurance=temp;
			}
		}
		
		System.out.println("Character :"+maxCharacter+" has Maximum Occurrance of :"+occurance);
		
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();
		scan.close();
		
		string=Assignment4_Question1.removeSpaces(string);		//calling static method for removing spaces
		
		Assignment4_Question8 assignment4_Question8 = new Assignment4_Question8();
		assignment4_Question8.maximumOccurringCharacter(string);
		
	}

}
