/*
    This is number pyramid program. Here the input data is the number of rows as shown below in the following examples.
    Enter number of rows: 4
      1 
    2 3 2 
  3 4 5 4 3 
4 5 6 7 6 5 4 
    Enter number of rows: 8
              1 
            2 3 2 
          3 4 5 4 3 
        4 5 6 7 6 5 4 
      5 6 7 8 9 8 7 6 5 
    6 7 8 9 10 11 10 9 8 7 6 
  7 8 9 10 11 12 13 12 11 10 9 8 7 
8 9 10 11 12 13 14 15 14 13 12 11 10 9 8 
*/
#include <stdio.h>
int main()
{
    int i, s, r, k=0, c = 0, count = 0;

    printf("Enter number of rows: ");
    scanf("%d",&r);

    for(i=1; i<=r; ++i)
    {
        for(s=1; s <= r-i; ++s)
        {
            printf("  ");
            ++c;
        }

        while(k != 2*i-1)
        {
            if (c<= r-1)
            {
                printf("%d ", i+k);
                ++c;
            }
            else
            {
                ++count;
                printf("%d ", (i+k-2*count));
            }
            ++k;
        }
        count = c = k = 0;

        printf("\n");
    }
}
