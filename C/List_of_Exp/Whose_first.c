/* WAP that reads two words from the user and your program must able to decide which word will 
appear former in the dictionary */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    system("cls");
    char s1[40],s2[40];
    int a;
    printf("Enter the sring 1: ");
    gets(s1);
    printf("Enter the sring 2: ");
    gets(s2);
    strlwr(s1);
    strlwr(s2);
    if (strcmp(s1,s2)<0)
    {
        printf("%s\t%s",s1,s2);
    }
    else if (strcmp(s1,s2)>0)
    {
        printf("%s\t%s",s2,s1);
    }
    else
    {
        printf("Both are same.");
    }
    
    return 0;
}