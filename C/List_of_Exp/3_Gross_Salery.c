#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int b_sal;
    float d_all, r_all, g_sal;
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");
    printf("Enter the basic salery of Ramesh: ");
    scanf("%d",&b_sal);

    d_all = 0.4 * b_sal;
    r_all = 0.2 * b_sal;

    g_sal = b_sal + d_all + r_all;

    printf("The Gross Salery of Ramesh is %.2f.\n\n",g_sal);
    return 0;
}