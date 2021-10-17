#include <stdio.h>

int Add(int x, int y)
{
    int z;

    z = x + y;

    printf("%d + %d = %d\n\n", x, y, z);

    return 0;
}

int main()
{

    char operator;
    int x, y;
    MAIN:
    printf("\nAddition +\nSubtraction -\nMultiplication *\nDivision /");

    printf("\nEnter operator: ");
    scanf(" %c", &operator);

    switch (operator)
    {
    case '+':
        printf("\nEnter 1st no.: ");
        scanf("%d", &x);

        printf("Enter 2nd no.: ");
        scanf("%d", &y);
        Add(x, y);
        goto MAIN;

    case '-':
        printf("sub");
        break;
    }

    return 0;
}
