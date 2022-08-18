
#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int num,r,sum=0,n;
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");
    printf("Enter a num for sum: ");
    scanf("%d",&num);
    n=num;
    while (num>0)
    {
        r = num%10;
        sum=sum+r;
        num = num/10;
    }
    printf("\nThe sum of all digits of %d is %d\n\n",n,sum);
    
    return 0;
}
