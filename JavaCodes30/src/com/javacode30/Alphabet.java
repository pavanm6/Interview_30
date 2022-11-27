//Write a JAVAprogram to check whether a character is alphabet or not.
package com.javacode30;

public class Alphabet {	
    public static void main(String[] args) {

        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
