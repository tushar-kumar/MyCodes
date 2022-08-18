
/* WAP that read the name of student of your class along with their roll no. print the entered info in
the sorted order of their name. */

#include<stdio.h>
#include<stdlib.h>

int main()
{
    system("cls");
    int n;
    struct student
    {
        int roll;
        char name[30];
    }arr[50];

    printf("Enter the no. of students: ");
    scanf("%d",&n);

    for (int i = 0; i < n; i++)
    {
        printf("Enter the Name & Roll of student %d: ",i+1);
        scanf("%s%d",&arr[i].name,&arr[i].roll);
    }

    printf("Details of student are");
    for (int i = 0; i < n; i++)
    {
        printf("%s %d\n",arr[i].name,arr[i].roll);
    }
    
    return 0;
}
