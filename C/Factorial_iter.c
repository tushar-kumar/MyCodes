// Factorial by for loop or itterative method

#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    double num, a,i;
    printf("Enter the num to get fectorial: \n");
    scanf("%lf",&num);
    a = 1;
    if (num>=0)
    {
        for ( i = 1; i < num+1; i++)
        {
            a=a*i;
        }
        printf("The factorial of %lf is %lf", num,a);
    }
    else
    {
        printf("Undefined");
    }

    return 0;
}
