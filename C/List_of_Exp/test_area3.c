#include <stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");

    int a[50], i, n, large, small, j, z;
    printf("Enter the number of elements : ");
    scanf("%d", &n);
    printf("Input the array elements : ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    large = small = a[0];

    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
            {
                z = a[i];
                a[i] = a[j];
                a[j] = z;
            }
        }
    }

    printf("\n");
    for (int c = 0; c < n; c++)
        printf("%d ", a[c]);

    for (int i = 0; i < n; i++)
    {
        a[i] = a[i + 1];
    }
    printf("\n Resultant Array \n");
    a[3] = 0;
    for (int c = 0; c < n - 2; c++)
        printf("%d ", a[c]);
    
    return 0;
}