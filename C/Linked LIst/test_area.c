#include <stdio.h>
#include <stdlib.h>

/* 
 * Basic structure of Node
 */
struct node
{
    int data;
    struct node *prev;
    struct node *next;
} * head, *last;

/*
 * Function used in this program 
 */
void createList(int n);

int main()
{
    printf("\n\t Ashutosh Sharma\n");
    int n, choice;

    head = NULL;
    last = NULL;

    printf("Enter the number of nodes you want to create: ");
    scanf("%d", &n);

    createList(n); // Create list of n nodes

    //to count even and odd elements

    int even = 0, odd = 0;

    struct node *temp;
    temp = head;
    while (temp != NULL)
    {
        if ((temp->data) % 2 == 0)
            even++;
        else
            odd++;
        temp = temp->next;
    }
    printf("\n Number of even Numbers are; - %d", even);
    printf("\nNumber of Odd numbers are :- %d", odd);
    printf("\n\tSAP ID 1000015540\n");
    return 0;
}

/**
 * Create a doubly linked list of n nodes.
 * @n Number of nodes to be created
 */
void createList(int n)
{
    int i, data;
    struct node *newNode;
    int even = 0, odd = 0;

    if (n >= 1)
    {
        head = (struct node *)malloc(sizeof(struct node));

        if (head != NULL)
        {
            printf("Enter data of 1 node: ");
            scanf("%d", &data);

            head->data = data;
            head->prev = NULL;
            head->next = NULL;

            last = head;

            /*
             * Create rest of the n-1 nodes
             */
            for (i = 2; i <= n; i++)
            { 
                newNode = (struct node *)malloc(sizeof(struct node));

                if (newNode != NULL)
                {
                    printf("Enter data of %d node: ", i);
                    scanf("%d", &data);

                    newNode->data = data;
                    newNode->prev = last; // Link new node with the previous node
                    newNode->next = NULL;

                    last->next = newNode; // Link previous node with the new node
                    last = newNode;       // Make new node as last/previous node
                }
                else
                {
                    printf("Unable to allocate memory.");
                    break;
                }
            }

            printf("\nDOUBLY LINKED LIST CREATED SUCCESSFULLY\n");
        }
        else
        {
            printf("Unable to allocate memory");
        }
    }
}