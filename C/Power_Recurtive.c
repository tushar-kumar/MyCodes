

#include<stdio.h>
#include<stdlib.h>

int power(int x,int y)
{
    if (y < 1)
        return 1;
    else
        return (x * power(x,y-1));
}

int main()
{
    system("cls");
    int num,exp;
    printf("Enter the num and its power seprated by comma: ");
    scanf("%d,%d",&num,&exp);

    printf("\n \t The value of %d^%d is %d.\n",num,exp,power(num,exp));

    return 0;
}