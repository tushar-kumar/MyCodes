#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int area, h, b;
    printf("Enter the height & base of triangle saperated by sapce: ");
    scanf("%d %d",&h,&b);
    area = b*h/2;
    printf("The area of the triangle is %d",area);
    return 0;
}