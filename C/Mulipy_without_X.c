
#include<stdio.h>
#include<stdlib.h>

int multiply(int x,int y)
{
    if (y < 1)
        return 0;
    else
        return (x + multiply(x,y-1));
}

int main()
{
    system("cls");
    int a,b;
    printf("Enter the num1 & num2 seprated by comma: ");
    scanf("%d,%d",&a,&b);

    printf("The product of %d & %d is %d", a,b,multiply(a,b));

    return 0;
}