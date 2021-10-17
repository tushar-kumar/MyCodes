/* Write a c program that computes the sum of n natural num by using user defined 
recursive function. */

#include<stdio.h>
#include<stdlib.h>

int sum(int x)
{
    if (x < 1)
        return 0;
    else
        return (x + sum(x-1));
}

int main()
{
    system("cls");
    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);
    
    printf("The sum of first %d natural numbers is %d", n,sum(n));
    return 0;
}