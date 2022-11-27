//26. Write a JAVAprogram to count number of digits in a number.
package com.javacode30;

public class Count {

	
	public class Main {

	  public static void main(String[] args) {

	    int count = 0, num = 0003452;

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	}

}
