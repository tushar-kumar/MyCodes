/* Write a program to print multiplication table upto 15 */

#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    for (int i = 1; i <= 10; i++)
    {
        for (int j = 1; j <= 19; j++)
        {
            printf("%4d",i*j);
        }
        printf("\n");
    }
    return 0;
}
