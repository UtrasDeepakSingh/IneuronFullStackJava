package com.Assignment4;

import java.util.Scanner;


/*
 * WAP to count the number of consonants, vowels, special characters in a String.
 */

public class Assignment4_Question4 
{
	int consonants=0;
	int vowels=0;
	int special=0;
	int numbers=0;
	
	public void stringOperations(String string)
	{
		char[] array=string.toCharArray();
		
		for(char ch:array)
		{
			checkCharacterType(ch);
			
		}
		
		System.out.println("Consonants count 		:"+this.consonants);
		System.out.println("Vowels count 	 		:"+this.vowels);
		System.out.println("Number count 		 	:"+this.numbers);
		System.out.println("Special Characters count	:"+this.special);
		
	}
	
	
	public void checkCharacterType(char ch)
	{
		int temp = ch;
		
		if((temp>=65&&temp<=90)||(temp>=97&&temp<=122))			//if char is A to Z or a to z
		{
		
			if(		temp==65||temp==97	|| 
					temp==69||temp==101	||
					temp==73||temp==105	||
					temp==79||temp==111	||
					temp==85||temp==117	)
			{
				this.vowels++;
			}
			else								//rest consonants
				this.consonants++;
		}
		else if((temp>=48&&temp<=57))		//if char is 1 to 9
		{
			this.numbers++;
		}
		else
			this.special++;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();
		scan.close();
		
		Assignment4_Question4 assignment4_Question4 = new Assignment4_Question4();
		assignment4_Question4.stringOperations(string);
	}

}
