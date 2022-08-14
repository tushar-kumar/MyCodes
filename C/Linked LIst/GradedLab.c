#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};
struct Node* head;

// Create Linked list of n Nodes
struct Node *CreateLinkedList(int n,struct Node *head)
{
    struct Node *new_node, *tmp;
    int item;

    for (int i = 0; i < n; i++)
    {
        new_node = (struct Node *)malloc(sizeof(struct Node));
        if (new_node == NULL)
        {
            printf("unable to allocate memory");
            exit(0);
        }
        else
        {
            printf("Enter item : ");
            scanf("%d", &item);
            new_node->data = item;
            new_node->next = NULL;

            //insert the first item
            if (head == NULL)
            {
                head = new_node;
            }
            else
            {
                tmp = head;
                while (tmp->next != NULL)
                {
                    tmp = tmp->next;
                }
                tmp->next = new_node;
            }
        }
    }
    return head;
}

// Find Element in the Linked List
int FindElement(int ToFind,struct Node *head)
{
	int ctr=1;
	while(head->next!=NULL)
	{
		if(head->data==ToFind)
			break;
		else
			ctr++;
			head=head->next;
	}
	return ctr;
}

// Traversal
void traverse(struct Node *head)
{
    struct Node* temp = head;
    printf("List is:");
    while(temp != NULL)
    {
        printf(" %d",temp->data);
        temp= temp->next;
    }
    printf("\n");
}

// Main Function
int main(){

    printf("\n\t Tushar Kumar\n");
    int num,n;
    struct Node *head = NULL;                    //empty list
    printf("Enter no. of Elements - ");
    scanf("%d", &n);
    head = CreateLinkedList(n,head);
    traverse(head);

    printf("Enter an Element: ");
    scanf("%d",&num);

    int pos = FindElement(num, head);
    if(pos<n)
		printf(" Element found at node %d \n",pos);
	else
		printf(" This element does not exists in linked list.\n");
    
    printf("\n\t SAP ID: 1000014268\n");

    return 0;
}