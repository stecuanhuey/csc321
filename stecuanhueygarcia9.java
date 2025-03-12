// Santiago Tecuanhuey Garcia
//
// Lab 9 - Java Version 

import java.util.Scanner;
import java.util.Random;

public class stecuanhueygarcia9{

	public static void main(String[] args){
	
	Scanner userInput  = new Scanner(System.in);
	int guess = 0, i, y; // test case with the variable x. Set x to 5 and 15.
			     
	Random randomInt = new Random();
	y = randomInt.nextInt(1,21);

	while(guess < 1 || guess > 20)
	{
	System.out.println("Enter a number between 1 and 20 :)");
	
	guess = userInput.nextInt();

	if (guess > 20 )
	{
	System.out.println("The number you entered is higher than my number, please try again!\n");
	}

	else if (guess < 1 )
	{
        System.out.println("The number you entered is lower than my number, please try again!\n");
        }
	
	}
if (guess == y)
{
	for(i = 0; i < guess; i++)
	{
	System.out.println("You won! \n");
	}
}

else if(guess > y)
{
	System.out.println("You lost :( The number you entered(" + guess + ") is bigger than my number " + y + ".");
}

else
{
	System.out.println("You lost :( The number you entered(" + guess + ") is lower than my number " + y + ".");
}
	
	}	
	
}

