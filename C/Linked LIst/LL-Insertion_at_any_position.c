#include<stdlib.h>
#include<stdio.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* head;

void Print () {
    struct Node* temp = head;

    while (temp != NULL){
        printf ("%d", temp->data);
        temp = temp->next;
    }

    printf("\n");
}

// The meat of the program
void Insert (int data, int position) {
    struct Node* newNode = malloc(sizeof(struct Node));

    newNode->data = data;
    newNode->next = NULL;

    if (position == 1) {
        newNode->next = head;
        head = newNode;
        return;
    }

    struct Node* previousNode = head;
    for (int i = 0; i < position - 2; i++) {
        previousNode = previousNode->next;
    }

    newNode->next = previousNode->next;
    previousNode->next = newNode;
}

int main () {
    head = NULL;

    Insert (2, 1);
    Print ();
    Insert (3, 2);
    Print ();
    Insert (4, 1);
    Print ();
    Insert (5, 2);
    Print ();
}