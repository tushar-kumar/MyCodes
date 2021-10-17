/* Write a C program that print the following structure on the screen
              *
            * * *
          * * * * *
        * * * * * * *
*/

#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int i,j,k,n=1;
    printf("Enter the Number of rows: ");
    scanf("%d",&i);
    for ( ; i > 0; i--)
    {
        for ( j = 1; j <  i; j++)
        {
            printf("  ");
        }
        for (k = 0; k < n; k++)
        {
            printf(" *");
        }
        printf("\n");
        n+=2;
    }
    
    return 0;
}
