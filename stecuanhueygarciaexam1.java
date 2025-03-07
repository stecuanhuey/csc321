// Exam 1 
// Java program 
//
//
//


import java.util.Scanner;
public class exam1{
public static void main(String[] args){


	int myInt = 17;
	

	System.out.println("Enter an integer number.");
	Scanner userInput = new Scanner(System.in);
	int userInt = userInput.nextInt();

	if (userInt == myInt){
		System.out.println("Congratulations! You won an island off the Bahamas!! :) ");
	}

	else{
	System.out.println("Unfortunately, you have LOST. NO PRIZE.");
	}

	}
}
