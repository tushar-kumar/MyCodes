#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int h, b;
    float area;
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n");
    printf("Enter the height of the triangle: ");
    scanf("%d",&h);
    printf("Enter the base of the triangle: ");
    scanf("%d",&b);
    area = b*h/2.0;
    printf("\nThe area of the triangle is %.2f \n\n",area);
    return 0;
}