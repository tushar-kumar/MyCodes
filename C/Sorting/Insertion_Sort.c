#include<stdio.h>
#include<stdlib.h>

void insertionsort(int *A, int n){
    for (int i = 1; i < n; i++)
    {
        int key = A[i];
        for (int j = i-1; j >= 0; j--)
        {
            if (key < A[j])
            {
                A[j+1] = A[j];
                A[j] = key;
            }
            else
                break;
        }
    }  
}

void printArray(int *A, int n){
    for (int i = 0; i < n; i++)
        printf("%d ",A[i]);
    printf("\n");
}

int main()
{
    system("cls");
    // int A[] = {12, 17, 8, 6, 56, 22};
    int A[] = {2, 8, 85, 99, 106, 204, 12, 17, 8, 6, 56, 22};
    int n = 12;
    printArray(A, n);
    insertionsort(A, n);
    printArray(A, n);

    return 0;
}