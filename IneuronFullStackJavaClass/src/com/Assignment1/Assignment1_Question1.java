package com.Assignment1;


/*
 * Write a program(WAP) to print INEURON using pattern programming logic.
 */
public class Assignment1_Question1 
{

	public static void main(String[] args) 
	{
		int n=15;
		
		for(int i=0;i<n;i++)
		{
			
			
			//Code for I
			for(int j=0;j<n;j++)		
			{
				if(
						i==0		||
						i==(n-1)	||
						j==(n-1)/2
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
			//Code for N
			for(int j=0;j<n;j++)		
			{
				if(
						j==0		||
						j==(n-1)	||
						i-j==0
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
		
			//Code for E
			for(int j=0;j<n;j++)		
			{
				if(
						i==0		||
						i==(n-1)/2	||
						i==(n-1)	||
						j==0
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
			//Code for U
			for(int j=0;j<n;j++)		
			{
				if(
						j==0&&i<n-1					||
						j==(n-1)&&i<n-1				||
						i==(n-1)&&j>0&&j<(n-1)
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
			//Code for R
			for(int j=0;j<n;j++)		
			{
				if(
						j==0						||
						j==(n-1)&&i>0&&i<(n-1)/2	||
						i==0&&j<n-1					||
						i==(n-1)/2&&j<n-1			||
						i>(n-1)/2&&i-j==0
						
						
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
			//Code for O
			for(int j=0;j<n;j++)		
			{
				if(
						i==0&&j>0&&j<n-1	||
						i==n-1&&j>0&&j<n-1	||
						j==0&&i>0&&i<n-1	||
						j==n-1&&i>0&&i<n-1
						
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
			//Code for N
			for(int j=0;j<n;j++)		
			{
				if(
						j==0		||
						j==(n-1)	||
						i-j==0
					)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			
			
			System.out.println();
			
		}			//for loop i
			
	}
					
		
}


