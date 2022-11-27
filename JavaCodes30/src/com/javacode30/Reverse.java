//18. Write a JAVAprogram to print all natural numbers in reverse (from n to 1). - using while loop
	// Java Program to Print Natural Numbers in Reverse 
	
package com.javacode30;
import java.util.Scanner;

public class Reverse {

	
	

	public class ReverseNaturalNum1 {
		private static Scanner sc;
		public static void main(String[] args) 
		{
			int number, i;
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter the Maximum integer Value : ");
			number = sc.nextInt();	
			
			for(i = number; i >= 1; i--)
			{
				System.out.print(i +"\t"); 
			}	
		}
	}

}

