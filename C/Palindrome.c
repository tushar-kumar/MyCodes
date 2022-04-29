
#include <stdio.h>
#include <stdlib.h>

int main()
{
    system("cls");
    int num, rem, r, rev_num = 0;
    printf("Enter the num:");
    scanf("%d", &num);
    r = num;
    while (r > 0)
    {
        rem = r % 10;
        rev_num = rev_num * 10 + rem;
        r /= 10;
    }
    if (rev_num == num)
    {
        printf("%d is a palindrome number.", num);
    }
    else
    {
        printf("%d is not a palindrome number.", num);
    }

    return 0;
}
