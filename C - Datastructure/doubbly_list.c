#include<stdio.h>
#include<stdlib.h>
struct node
{
int data;
struct node *prev;
struct node *next;
};*l,*f;
void initdll()
{
    f=l=NULL;
}
void create()
{
int n,i,val;
struct node *s;
printf("enter number of nodes needed : ");
scanf("%d",&n);

for(i=1;i<n;i++)
{
  printf("enter data : ");
scanf("%d",&val);  
s->next=(struct node *)malloc(sizeof(struct node));
s->data=val;
s->prev=s->next=NULL;
}
if(f==NULL)
{
    f=l=s;
}
else
{
    l->next=s;
    s->prev=l;
    l=s;
}
}
void display()
{
struct node *s;
for(s=f;s!=NULL;s=s->next)
{
printf(" %d -> ",s->data);
}
}

