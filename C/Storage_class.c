
#include<stdio.h>
#include<stdlib.h>
int y=5;

int fun()
{
    int x=5;
    printf("%d \t %d \n",x,y);
    x++;
    y++;
}

int main()
{
	system("cls");
    fun();
    fun();
    fun();
    return 0;
}