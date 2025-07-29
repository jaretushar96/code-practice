#include <stdio.h>
#include <stdlib.h>

struct node {
    int info;
    struct node *left, *right;
};

struct node* bst(struct node* root, int val);
void inorder(struct node* root);
void preorder(struct node* root);
void postorder(struct node* root);

int main() {
    int val, ch;
    struct node* root = NULL;

    do {
        printf("\n--- Binary Search Tree Menu ---");
        printf("\n1. Create BST");
        printf("\n2. Insert new node");
        printf("\n3. Inorder Traversal");
        printf("\n4. Preorder Traversal");
        printf("\n5. Postorder Traversal");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("\nEnter values for BST (0 to stop): ");
                scanf("%d", &val);
                while (val != 0) {
                    root = bst(root, val);
                    scanf("%d", &val);
                }
                break;

            case 2:
                printf("\nEnter value to insert: ");
                scanf("%d", &val);
                root = bst(root, val);
                break;

            case 3:
                printf("\nInorder Traversal: ");
                inorder(root);
                printf("\n");
                break;

            case 4:
                printf("\nPreorder Traversal: ");
                preorder(root);
                printf("\n");
                break;

            case 5:
                printf("\nPostorder Traversal: ");
                postorder(root);
                printf("\n");
                break;

            default:
                printf("\nInvalid choice!");
        }
    } while (ch >= 1 && ch <= 5);

    return 0;
}

struct node* bst(struct node* root, int val) {
    struct node *p = NULL, *q = root, *t;

    // Search for the right position
    while (q != NULL && val != q->info) {
        p = q;
        if (val < q->info)
            q = q->left;
        else
            q = q->right;
    }

    // Duplicate value found
    if (q != NULL && val == q->info) {
        printf("\nDuplicate value is not allowed.");
        return root;
    }

    // Allocate memory for new node
    t = (struct node*)malloc(sizeof(struct node));
    t->info = val;
    t->left = t->right = NULL;

    // First node
    if (root == NULL)
        return t;

    // Attach to the correct parent
    if (val < p->info)
        p->left = t;
    else
        p->right = t;

    return root;
}

void inorder(struct node* root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->info);
        inorder(root->right);
    }
}

void preorder(struct node* root) {
    if (root != NULL) {
        printf("%d ", root->info);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node* root) {
    if (root != NULL) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->info);
    }
}
