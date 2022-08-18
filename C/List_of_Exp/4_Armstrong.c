#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    system("cls");
    int num,n,rem,arm=0,count=0;

    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");

    printf("Enter the Num: ");
    scanf("%d",&num);

    n = num;

    while(n>0)
    {
        rem = n%10;
        n = n/10;
        count+=1;
    }
    n=num;
    while(n>0)
    {
        rem = n%10;
        n = n/10;
        arm += pow(rem,count);
    }
    if (num==arm)
        printf("%d is Armstrong Number\n\n",arm);
    else
        printf("%d is Armstrong Number.\n\n",num);
    
    return 0;
}   