#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cp(char *s)
{
    int i, c = 0, n;
    n = strlen(s);
    for (i = 0; i < n / 2; i++)
    {
        if (s[i] == s[n - i - 1])
            c++;
    }
    if (c == i)
        return 1;
    else
        return 0;
}

int main()
{
    system("cls");
    char s[1000];
    printf("Name: TUSHAR KUMAR \n");
    printf("SAP ID: 1000014268 \n\n");

    printf("Enter the string: ");
    gets(s);
    strlwr(s);

    if (cp(s))
        printf("String is palindrome");
    else
        printf("String is not palindrome");
    return 0;
}