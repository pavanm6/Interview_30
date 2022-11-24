package com.corejava.project;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		for( int i=0;i<10;i++) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value :" );
		String name = input.nextLine();
		System.out.println(name);
	}
}
}	
 