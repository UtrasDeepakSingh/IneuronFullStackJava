package com.Assignment3;


public class RandomNumberGenerator 
{
	
	public static int getRandomNumber(int max)
	{
		return ((int) (Math.random() * max));
	}
	
	public static void main(String [] args)
	{
		System.out.println(RandomNumberGenerator.getRandomNumber(100));
	}
}
