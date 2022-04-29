#include<stdio.h>
#include<stdlib.h>

void printArray(int *A, int n){
    for (int i = 0; i < n; i++)
        printf("%d ",A[i]);
    printf("\n");
}

void BubbleSort(int *A, int n){
    int isSorted=0;
    for (int i = 0; i < n-1; i++)
    {
        isSorted = 1;
        for (int j = 0; j < n-1-i; j++)
        {
            if (A[j] > A[j+1])
            {
                int temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                isSorted = 0;
            }
        }
        if (isSorted)
        {
            // printf("Array is already Sorted.\n");
            return;
        }
        
    }
}


int main()
{
    system("cls");
    int A[] = {2,1,3,4,5,6};
    int n = 6;
    printArray(A, n);
    BubbleSort(A, n);
    printArray(A, n);
    return 0;
}