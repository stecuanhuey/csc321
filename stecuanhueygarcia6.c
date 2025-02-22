// Santiago Tecuanhuey Garcia 
//
// Lab 6 - C Version 
//
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void){
	
		
	double x = 19.31;
	int y = 7;

	double endResult;
	int endIntResult;

	double dubX = 19.31;
	double dubY = 7.00;
	
	int intX = 1931;
	int intY = 7;

	// The first evaluation(for both double and int).
	printf("The first evaluation (double and int) is: ");
	endResult = x + y * x/ y - x;
	printf("%lf\n",endResult);

	// The second evaluation(for both double and int).
        printf("The second evaluation (double and int) is: ");
        endResult = -x - y /x * y + x;
        printf("%lf\n",endResult);

	// The third evaluation(for both double and int).
        printf("The third evaluation (double and int) is: ");
        endResult = x + y - x / y;
        printf("%lf\n",endResult);

	printf("--------------------------------------------------\n");

	//The first evaluation(for only int within expression).
	printf("The first evaluation (for only int) is: ");
	endIntResult = x + y * x/ y - x;
	printf("%d\n",endIntResult);

	//The second evaluation(for only int within expression).
        printf("The second evaluation (for only int) is: ");
        endIntResult = -x - y /x * y + x;
        printf("%d\n",endIntResult);

	//The third evaluation(for only int within expression).
        printf("The third evaluation (for only int) is: ");
        endIntResult = x + y - x / y;
        printf("%d\n",endIntResult);

	printf("--------------------------------------------------\n");

	//The first evaluation(for only double within expression).
	printf("The first evaluation (for only double) is: ");
	endResult = x + y * x/ y - x;
        printf("%lf\n",endResult);

	//The second evaluation(for only double within expression).
	printf("The second evaluation (for only double) is: ");
	endResult = -x - y /x * y + x;
        printf("%lf\n",endResult);

	//The third evaluation(for only double within expression).
	printf("The third evaluation (for only double) is: ");
	endResult = x + y - x / y;
        printf("%lf\n",endResult);


	return EXIT_SUCCESS;
}
