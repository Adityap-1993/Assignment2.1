package comparison;

import java.util.Scanner;          //importing Scanner

public class Compare {             //Class definition

	public static void main(String[] args) {     // Main method starting from here
		
		Scanner sc = new Scanner(System.in);      //Creating Scanner object
		
		System.out.println("Enter the three numbers: " ); 
		
		int num1=sc.nextInt();                 // Taking inputs from user assigning to object.
		                                
		int num2=sc.nextInt();
		
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)             //Comparison for first number
	    
		System.out.println("The " + num1 + " is the highest.");
		
		else if(num2>num3 && num2>num1)       //Comparison for second number
	    System.out.println("The " + num2 + " is the highest.");
		
		else                            // If above two conditions fail then third number is highest.
	     System.out.println("The "  + num3 + " is the highest.");
		

	}

} //Class ends here
