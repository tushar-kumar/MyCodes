/* write a c program that computes the fectorial of the given number by creating a 
user defined recursive function */

#include<stdio.h>
#include<stdlib.h>

int fact(int x)
{
    if (x <= 1)
        return 1;
    else
        return (x * fact(x-1));
}

int main()
{
    system("cls");
    int num,a;
    printf("Enter the num to get fectorial: ");
    scanf("%d",&num);

    printf("\n \t The factorial of %d is %d.\n",num,fact(num));

    return 0;
}