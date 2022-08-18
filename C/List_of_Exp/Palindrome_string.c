
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    system("cls");
    char s1[30],s2[30];
    printf("Enter a string: ");
    gets(s1);
    strlwr(s1);
    strcpy(s2,s1);
    strrev(s2);
    if (strcmp(s1,s2)==0)
    {
        puts(s1);
        printf(" is a palindrome string.");
        
    }

    else
    {
        puts(s1);
        printf("is not a palindrome string.");
        
    }

    
    return 0;
}