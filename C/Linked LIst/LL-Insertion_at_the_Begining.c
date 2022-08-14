#include <stdlib.h>
#include <stdio.h>

struct Node
{
  int data;
  struct Node *next;
};

struct Node *head;
void insert(int x);
void print();

void main()
{
  head = NULL;
  printf("how many numbers?\n");
  int n, i, x;
  scanf("%d", &n);
  for (i = 0; i < n; i++)
  {
    printf("enter the number\n");
    scanf("%d", &x);
    insert(x);
    print();
  }
}

void insert(int x)
{
  struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
  temp->data = x;
  temp->next = head;
  head = temp;
}
void print()
{
  struct Node *temp = head;
  printf("List is:");
  while (temp != NULL)
  {
    printf("%d  ", temp->data);
    temp = temp->next;
  }
  printf("\n");
}