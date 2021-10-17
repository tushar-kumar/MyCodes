#include <stdio.h>
#include <stdlib.h>

int main()
{
    system("cls");
    int n, m;
    printf("Enter No. of rows: ");
    scanf("%d", &n);
    m = n;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m - 1; j++)
        {
            printf(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++)
        {
            if (k == 1 || k == 2 * i - 1 || i == n)
                printf("*");
            else
                printf(" ");
        }
        m--;

        printf("\n");
    }
    return 0;
}