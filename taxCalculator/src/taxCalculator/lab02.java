/*
 *   Name: Amirreza Mirzaei
 */
package taxCalculator;

import java.util.Scanner; // Needed for the Scanner class 
/** 
This program calculates the total price which includes 
sales tax. 
*/ 
public class lab02 
{ 
public static void main(String[] args) 
{ 
// Identifier declarations 
	final double TAX_RATE = 0.13; 
	double price = 0; 
	double tax = 0; 
	double total = 0; 
	String item = ""; 
// Create a Scanner object to read from the keyboard. 
	Scanner scan = new Scanner(System.in);
// Display prompts and get input. 
	System.out.print("Please Enter Your Item description: "); 
	item = scan.nextLine(); 
	System.out.print("Item price: $"); 
	price = scan.nextDouble(); 
	// Perform the calculations. 
	tax = price * TAX_RATE; 
	total = price + tax; 


// Display the results. 
	System.out.print(item + " " + "$"); 
	System.out.println(price); 
	System.out.print("Tax $"); 
	System.out.println(tax); 
	System.out.print("Total is $"); 
	System.out.println(total); 
} 
}
