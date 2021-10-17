/* Write a C program that print the following structure on the screen
reverse star pattern..
        
*/

#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int i,j,k,n,rows;
    printf("Enter the Number of rows: ");
    scanf("%d",&n);
    for (i=0 ; i > 0; i--)
    {
        for (k = 0; k < i; k++)
        {
            printf(" ");
        }
        for ( j = i; j > 0 ; j--)
        {
            printf("*");
        }

        printf("\n");
        n+=1;
    }
    
    return 0;
}
