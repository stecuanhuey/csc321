// Santiago Tecuanhuey Garcia 
//
#include <stdio.h>
#include <stdlib.h>

void printUser(int numPrint);

int main (void)
{
	int userNumPrint;

	printf("Welcome User! Enter the number of times you would like my name to print out. \n");
	scanf("%d", &userNumPrint);

	printUser(userNumPrint);

	return EXIT_SUCCESS;
}

void printUser(int numPrint)
{
	int i;

	for(i = 0; i < numPrint; i++){
	printf("Santiago Tecuanhuey Garcia\n");
	}

}

