/*14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
		BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
		BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
		BasiJAVASalary > 20000 : HRA = 30%, DA = 95% */

package com.javacode30;
import java.util.*;	

public class Main {

			
		
		
			public static void main(String args[])
			{
			double basic=20000.50,gross,da,hra;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Basic Salary :- ");
			basic = in.nextDouble();
			if(basic <=10000)
			{
				da = basic * 0.8;
				hra = basic *0.2;
			} 	
		        else if(basic <=20000)
			{
				da = basic * 0.9;
				hra = basic *0.25;
			}
			else 
			{
				da = basic * 0.95;
				hra = basic * 0.3;
			}
			gross = basic + da + hra;
			System.out.println("The Gross Salary is :-"+gross);	
		}
		}

