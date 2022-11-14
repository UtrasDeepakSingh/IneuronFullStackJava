package com.Assignment4;



/*
 *  WAP to check if “2552” is palindrome or not.
 */


public class Assignment4_Question3 
{

	public static void main(String[] args) 
	{
		int[]numArray= {2,5,5,2};
		
		for(int x:numArray)
		System.out.print(x+" ");
		System.out.println();
		
		boolean isPalindrome=false;
		
		for(int i=0;i<numArray.length;i++)
		{
			if(numArray[i]==numArray[(numArray.length-1)-i])	
			{
				isPalindrome=true;
			}
			else 
				isPalindrome=false;
			
		}
		
		if(isPalindrome)
			System.out.println("Is A Palindrome");
		else
			System.out.println("Is Not A Palindrome");
		
		
		
	}

}
