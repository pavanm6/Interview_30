//25. Write a JAVAprogram to print multiplication table of any number.
package com.javacode30;
import java.util.Scanner;


public class Table {

	
		
	   public static void main(String[] args)
	   {
	       Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");       
		int n=s.nextInt();
	       for(int i=1; i <= 10; i++)
	       {
	           System.out.println(n+" * "+i+" = "+n*i);
	       }
	   }
	}



