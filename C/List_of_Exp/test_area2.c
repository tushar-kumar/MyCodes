#include <stdio.h>
#include <stdlib.h>

int main()
{
    system("cls");
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");

    int arr[30],n,sum=0,c=0;
    

    printf("Enter number of elements: ");
    scanf("%d",&n);

    printf("Enter the Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        if (i%2!=0)
        {
            sum+=arr[i];
        }
        
    }
    for (int i = 2; i <= sum / 2; ++i) 
    {
        if (sum % i == 0) 
        {
            c = 1;
            break;
        }
    }

    if (sum == 1) {
        printf("1 is neither prime nor composite.");
    }
    else {
        if (c == 0)
            printf("%d is a prime number.", sum);
        else
            printf("%d is not a prime number.", sum);
    }
    

    return 0;
}