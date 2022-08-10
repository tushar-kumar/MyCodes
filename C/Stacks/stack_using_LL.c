#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *top = NULL;

void stackTraversal(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("|  %d \t|\n", ptr->data);
        ptr = ptr->next;
    }
}

int isEmpty(struct Node *ptr)
{
    return ptr == NULL;
}

int isFull()
{
    struct Node *p = (struct Node *)malloc(sizeof(struct Node));
    return p == NULL;
}

void pop(struct Node *tp)
{
    if (isEmpty(tp))
        printf("Strack is Underflow\n");
    else
    {
        struct Node *n = tp;
        top = (tp)->next;
        int x = n->data;
        free(n);
        printf("Poped Element is %d\n",x);
    }
}

struct Node *push(struct Node *top, int data)
{
    if (isFull())
        printf("Stack is Overflow\n");
    else
    {
        struct Node *n = (struct Node *)malloc(sizeof(struct Node));
        n->data = data;
        n->next = top;
        top = n;
        return top;
    }
}

int main()
{
    top = push(top, 20);
    top = push(top, 30);
    pop(top);
    top = push(top, 12);
    top = push(top, 181);
    top = push(top, 9);
    
    stackTraversal(top);

    return 0;
}