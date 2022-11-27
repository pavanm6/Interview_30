/*15. Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:
		For first 50 units Rs. 0.50/unit
		For next 100 units Rs. 0.75/unit
		For next 100 units Rs. 1.20/unit
		For unit above 250 Rs. 1.50/unit
		An additional surcharge of 20% is added to the bill
*/

package com.javacode30;

public class Current_Bill {

				// import required classes and package if any  
			// create class ElectricityBillExample1 to calculate electricity bill  
			class ElectricityBillExample1   
			{   
		    // main() method start  
			    public static void main(String args[])   
			    {     
			        // declare and initialize variable units  
			        int units = 380;  
			        // variable to calculate electricity bill to pay  
			        double billToPay = 0;  
			        // check whether units are less than 100  
		        if(units < 100)  
			        {  
			            billToPay = units * 1.20;  
			        }  
			        // check whether the units are less than 300  
			        else if(units < 300){  
			            billToPay = 100 * 1.20 + (units - 100) * 2;  
		        }  
			        // check whether the units are greater than 300  
			        else if(units > 300)  
			        {  
			            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
			        }  
			        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
			    }   
			}
}

