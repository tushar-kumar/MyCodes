#include<stdio.h>
#include<stdlib.h>

int main()
{
	system("cls");
    int x=10, *y,**z;
    y=&x;
    z=&y;
    printf("%d,,%d,,%d",x,*y,**z);

    return 0;
}