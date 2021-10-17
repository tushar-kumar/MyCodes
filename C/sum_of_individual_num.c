// write a c program that computes the sum of the individual digit of a given number n

#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int num,r,sum=0,n;
    printf("Enter a num for sum: ");
    scanf("%d",&num);
    n=num;
    while (num>0)
    {
        r = num%10;
        sum=sum+r;
        num = num/10;
    }
    printf("The sum of individual digits of %d is %d",n,sum);
    
    return 0;
}
