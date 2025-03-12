// Santiago Tecuanhuey Garcia 
//
//Lab 9 - C Version 
//


#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(void){

int guess = 0, i, y; // test case with the variable x. Set x to 3, set x to 17.
srand(time(NULL));

y = 1 + (rand() % 21);

while(guess < 1 || guess > 20)
{	
	printf("Enter a number between 1 and 20 :) ");
	scanf("%d", &guess);

	if (guess > 20 )
	{
	puts("The number you entered is higher than my number, please try again!\n");
	}

	else if (guess < 1 )
	{
        puts("The number you entered is lower than my number, please try again!\n");
        }
}

if (guess == y)
{
for(i = 0; i < guess; i++)
	{	
	printf("You won! \n");
	}	
}

else if(guess > y)
{
printf("You lost :( The number you entered(%d) is bigger than my number(%d).\n", guess, y);
}

else{
printf("You lost :( The number you entered(%d) is lower than my number(%d).\n", guess, y);
}


return EXIT_SUCCESS;
}
