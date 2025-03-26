// Santiago Tecuanhuey Garcia
//
// Lab 11 
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calcHype(double base, double height);

int main (void){

	int userBase, userHeight;
	double userResult;
		
	printf("Welcome User! Enter the base of your triangle: ");
	scanf("%d", &userBase);

	printf("Enter the height of your triangle: ");
        scanf("%d", &userHeight);

	userResult = calcHype(userBase, userHeight);

	printf("Your calculated Hypotenuse is: %.2f\n", userResult);


return EXIT_SUCCESS;
}

double calcHype(double base, double height){
	
	double result = sqrt(pow(base,2) + pow(height,2));

	return result;
}
