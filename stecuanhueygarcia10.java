// Santiago Tecuanhuey Garcia
// Lab 10 

import java.lang.Math;
import java.util.Scanner;

public class stecuanhueygarcia10{

	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);

		int cylHeight = 0, cylRadius = 0;
	       double result = 0;	

		System.out.println("Welcome User! Please enter the Radius of your cylinder."); 
		cylRadius = userInput.nextInt();

		System.out.println("Please enter the Height of your cylinder.");
		cylHeight = userInput.nextInt();

 		result = area(cylRadius,cylHeight);

		System.out.println("Your total volume for your cylinder is: " + result);
	}
	
	public static double area(int intRadius, int intHeight){

		double pi = Math.PI;

		double totalArea = pi * Math.pow(intRadius,2) * intHeight;

		return totalArea;

	}


}
