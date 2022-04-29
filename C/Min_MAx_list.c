/* write a C program that find max amd min from the given list of n num make sure 
that at the time of finding try to use single loop */


#include<stdio.h>
#include<stdlib.h>


int main()
{
    system("cls");
    int n, arr[20],max=0,min;
    printf("Enter the number of elements(<20): ");
    scanf("%d",&n);
    printf("Enter the elements of the matrix: \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
        min=arr[i];
        max = (arr[i]>max) ? arr[i]: max;
        min = (arr[i]<min) ? arr[i]: min;

    }

    printf("The max & min numbers of array are: %d,%d",max,min);
    return 0;
}