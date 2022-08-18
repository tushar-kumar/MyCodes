#include <stdio.h>
#include <stdlib.h>

int main()
{
    system("cls");
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");

    int arr[100];
    int size, i, toSearch, found;
    printf("Enter size of array: ");
    scanf("%d", &size);
    printf("Enter elements in array: ");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("\nEnter element to search: ");
    scanf("%d", &toSearch);
    found = 0;
    for (i = 0; i < size; i++)
    {
        if (arr[i] == toSearch)
        {
            found = 1;
            break;
        }
    }
    if (found == 1)
    {
        printf("\n%d is found at index %d", toSearch, i);
    }
    else
    {
        printf("\n%d is not found in the array", toSearch);
    }
    return 0;
}