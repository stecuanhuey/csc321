// Santiago Tecuanhuey Garcia
// Lab 5
//
//
//
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (void)
{
	int i = 0;

	int x = 5;
	char myChar = 'S';
	float myFloat = 19.3100f;
	double myDouble = 1234.56;

	int a[10] = {2,4,6,8,10,12,14,16,18,20};

		printf("The value of myInteger is %d and it's address is %p. \n",x,&x);
		printf("The value of myCharacter is %c and it's address is %p. \n",myChar,&myChar);
		printf("The value of myFloat is %f and it's address is %p \n",myFloat,&myFloat);
		printf("The value of myDouble is %lf and it's address is %p \n",myDouble,&myDouble);


		{
			int y = 10;
		}
	//	 printf(" the value of y is %d \n",y,&);
		
	for (i = 0; i < 10; i++)
	{
	printf("The address of a[%d] = %p \n", a[i],&a[i]);
	} 
		
		
		return EXIT_SUCCESS;

}
