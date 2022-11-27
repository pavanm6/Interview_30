//28. Write a JAVAprogram to find sum of first and last digit of a number.

package com.javacode30;

public class Example1 {
	
	    public static void main(String[] args) {
	        System.out.println(sumFirstAndLastDigit(1221)); 
	        // output is 2	
	    }
	    public static int sumFirstAndLastDigit (int number) {
	        if (number < 0) {
	            return -1;
	        }
	        int lastDigit = number % 10;
	        while (number > 9) {
	            number /= 10;
	        }
	        return lastDigit + number;
	    }
	}



