/* write a c program that find greatest numbers amongst the given list of n numbers */

#include<stdio.h>
#include<stdlib.h>


int main()
{
    system("cls");
    int n, arr[20],lar=0;
    printf("Enter the number of elements(<20): ");
    scanf("%d",&n);
    printf("Enter the elements of the matrix: \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
        lar = (arr[i]>lar) ? arr[i]: lar;
    }

    printf("The largest number of array is: %d",lar);
    return 0;
}