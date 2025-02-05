// Santiago Tecuanhuey Garcia
//


import java.util.Scanner;

public class stecuanhueygarcia4
{	
	public static void main(String[] args)
	{
		
		int x = 0;

		System.out.println("Go ahead and choose one of the four options: ");
		System.out.println(" Option 1: In N Out ");
		System.out.println(" Option 2: Raising Canes ");
		System.out.println(" Option 3: Chipotle ");
		System.out.println(" Option 4: Wingstop ");
		
		Scanner userInput = new Scanner(System.in);
		x = userInput.nextInt();

		if(x == 1)
		{
		System.out.println("You have chosen option " + x + " : In N Out!");
		}
		else if (x == 2)
		{
		System.out.println("You have chosen option " + x + ": Raising Canes!");
		} 
		else if (x == 3)                                                                                                        
		{
		System.out.println("You have chosen option " + x + ": Chipotle!");
                }
		else
		{
		System.out.println("You have chosen option 4: Wingstop!");
                }

	}
}
