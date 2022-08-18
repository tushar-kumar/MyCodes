#include <stdio.h>
#include <stdlib.h>
 

int main()
{
    system("cls");
    int arr[100], size, i;
    int ma1, ma2;

    printf("Name: \n");
    printf("SAP ID: 1000014149 \n\n");

    printf("Enter size of the array: ");
    scanf("%d", &size);
 
    printf("Enter elements in the array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    ma1 = ma2 = 0;

    for(i=0; i<size; i++)
    {
        if(arr[i] > ma1)
        {
            
            ma2 = ma1;
            ma1 = arr[i];
        }
        else if(arr[i] > ma2 && arr[i] < ma1)
        {
            ma2 = arr[i];
        }
    }

    int mi1=ma1, mi2=ma1;
    for(i=0; i<size; i++)
    {
        if(arr[i] < mi1)
        {
            
            mi2 = mi1;
            mi1 = arr[i];
        }
        else if(arr[i] < mi2 && arr[i] > mi1)
        {
            mi2 = arr[i];
        }
    }

    int sum = ma2+mi2;

    printf("\nThe sum of the numbers is: %d",sum);

    return 0;
}