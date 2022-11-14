package com.Assignment4;

import java.util.Scanner;

/*
 * WAP to print Duplicates characters from the String.
 */

public class Assignment4_Question2 
{
	public void printDuplicates(String noSpaceString)
	{
		
		
		char[] charArray = noSpaceString.toCharArray();	//conversion to char Array
		
		
		noSpaceString=null;	
		
		for(int i=0;i<charArray.length-1;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				if(charArray[i]==charArray[j]&&noSpaceString==null)		//no previous record present write
				{
					noSpaceString=charArray[i]+"";
					break;
				}
				else if(charArray[i]==charArray[j]&&noSpaceString!=null)	//if previous record present check
				{
					if(isDuplicates(noSpaceString, charArray[j]))
					{
						noSpaceString+=charArray[i];
					}
				}
				
				
			}
		}
		
		
		System.out.println(" Duplicate Characters of the String : ");
		System.out.println(noSpaceString);
		
	}
		
		
	public  static boolean isDuplicates(String string,char ch)
	{
		
		
			char[] charArray=string.toCharArray();
		
			for(char temp:charArray)
			{
				if(ch==temp)
				{
					return false;
				}
				
			}
		
			
		return true;
		
	}
		
	
	

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();
		scan.close();
		string=Assignment4_Question1.removeSpaces(string);		//calling static method for removing spaces
		
		Assignment4_Question2 assignment4_Question2  = new Assignment4_Question2 ();
		assignment4_Question2.printDuplicates(string);

	}

}
