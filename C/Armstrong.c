// Its WRONG PLEASE DONT RUN //



#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    system("cls");
    int num,r;
    printf("Enter a num for sum: ");
    scanf("%d",&num);

    for (int i = 0; i < num; i++)
    {
        int j=i, arm = 0, count=0;
        while (j>0)
        {
            r = j%10;
            arm = arm+(r*r*r);
            j = j/10;
            count+=1;
        }
        int z;
        z=log10(i)+1;
        if (arm==i)
            printf("\t%d,%d\t",z,arm);   
    }

    return 0;
}
