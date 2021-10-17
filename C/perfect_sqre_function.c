
#include <stdio.h>

void sqre(int l, int r)
{
    int sap = 5537, temp,sum;
    while (sap!=0)
    {
        temp=sap%10;
        sum+=temp;
        sap/=10;
    }
    
    for (int j = (100 + sum); j < (200 + sum); j++)
    {
        if (j % 2 != 0)
        {
            for (int i = 1; i <= j; i++)
            {
                if (i * i == j)
                {
                    printf("\t%d", j);
                    break;
                }
            }
        }
    }
}

int main()
{
    printf("\n\tAbhishek Pandey\n\n");
    printf("The perfect square numbers are:");
    sqre(100, 200);
    printf("\n\n\tSap ID: 1000015537\n\n");
    return 0;
}