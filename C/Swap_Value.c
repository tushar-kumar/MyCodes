/*  Write a c program that perform the interchanging the content of two veriables by 
    making a user define function having name swap in the problem the input should be 
    pass to main function and interchange values should be displayed in the swap 
    function.   */

#include <stdio.h>
#include <stdlib.h>

void swap(int b,int a)
{
    // int temp=a;
    // a=b; b=temp;
    printf("The values of a is %d & b is %d.\n",a,b);
}

int main()
{
    system("cls");
    int a,b;
    printf("Enter two numbers saperaed by comma: ");
    scanf("%d,%d",&a,&b);
    swap(a,b);
    printf("The real values of a is %d and b is %d\n",a,b);
}