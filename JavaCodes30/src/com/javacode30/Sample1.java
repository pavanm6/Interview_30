//24. Write a JAVAprogram to find sum of all odd numbers between 1 to n.
	// Calculate the Sum of First N Odd & Even Numbers in Java

package com.javacode30;
import java.io.*;

public class Sample1 {
		


		// Driver function
		public static void main(String[] args)
		{
			int n = 8;
			int evenSum = 0;
			int oddSum = 0;

			for (int i = 1; i <= 2 * n; i++) {
				// check even & odd using Bitwise AND operator
				if ((i & 1) == 0)
					evenSum += i;
				else
					oddSum += i;
			}
			// Sum of even numbers less than 17
			System.out.println("Sum of First " + n
							+ " Even numbers = " + evenSum);

			// sum of odd numbers less than 17
			System.out.println("Sum of First " + n
							+ " Odd numbers = " + oddSum);
		}
	}


