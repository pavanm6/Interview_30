package com.corejava.project;

public class Test 
{

	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.println(" "); //print space
			}
			for(int j=0 ; j<i ; j++)
			{
				System.out.println("*"); // print star
			}
			System.out.println(""); //ending line after each row
			}
		}
	}


