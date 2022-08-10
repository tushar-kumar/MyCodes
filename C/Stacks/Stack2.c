#include <stdio.h>
#include <stdlib.h>

struct stack
{
    int size;
    int top;
    int *arr;
};

struct stack* newStack(int size)
{
    struct stack *s = (struct stack *) malloc(sizeof(struct stack));
    s->size = size;
    s->top = -1;
    s->arr = (int *) malloc(s->size * sizeof(int));
    return s;
}

int isEmpty(struct stack *ptr)
{
    // if (ptr->top == -1)
    //     return 1;
    // else
    //     return 0;
    return ptr->top == -1;
}

int isFull(struct stack *ptr)
{
    // if (ptr->top == ptr->size - 1)
    //     return 1;
    // else
    //     return 0;
    return ptr->top == ptr->size - 1;
}

void push(struct stack *ptr, int item)
{
    if (isFull(ptr))
        printf("Stack Is Overflow\n");
    else
    {
        ptr->arr[++ptr->top] = item;
        // ptr->top++;
        printf("%d is pushed to stack\n",item);
    }
}

int peak(struct stack *ptr)
{
    if (isEmpty(ptr))
        printf("Stack is underflow.\n");
    else
        printf("The top element is %d\n", ptr->arr[ptr->top]);
}

void pop(struct stack *ptr)
{
    if (isEmpty(ptr))
        printf("Stack is Underflow\n");
    else
    {
        // --ptr->top;
        printf("%d is poped from the stack.\n",ptr->arr[ptr->top--]);
    }
}

void display(struct stack *ptr)
{
    if (isEmpty(ptr))
        printf("Stack is Underflow\n");
    else
    {
        for (int i = 0; i <= ptr->top; i++)
            printf("|  %d \t|\n",ptr->arr[(ptr->top)-i]);
    }
}

int main()
{
    struct stack *s = newStack(9);
    // printf("\n\n\tTushar\n\n");

    // s->arr[0]=12;
    // s->top++;
    push(s,12);
    push(s,15);
    peak(s);
    push(s,8);
    pop(s);
    display(s);


    return 0;
}