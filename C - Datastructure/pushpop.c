#include<stdio.h>
#define MAX 5
struct stack
{
    int top;
    int item[MAX];

}s;
void initstack(struct stack *s)
{
    s-> top=-1;
}
void push (struct stack *s, int val)
{
    if(full(s))
    {
        printf("\n stack is full");
        exit(1);
    }
    else
    {
        s-> top++;
        s->item[s->top]=val;
    }
}
int full(struct stack *s)
{
    if (s->top==MAX-1)
    {
        return(1);
    }
    else
    {
        return(0);
    }
    

}
int pop(struct stack *s)
{
    int val;
    if(empty(s))
    {
        printf(" \n stack is empty");
        exit(2);
    }
   else
  {
   val=s->item[s->top];
   s->top--;
   return(val);
  
  }
}   

int empty(struct stack *s)
{
    if(s->top==-1)
    {
        return(1);
    }
    else
    {
     return(0);
    }
}

void display (struct stack *s )
{
    int i;
    if(s-> top==-1)
    {
        printf(" \n stack is empty");
        exit(3);
    }
    else
    {
     printf(" \n element of stack are =");
     for(i=0;i<=s-> top ;i++)
     {
        printf(" %d \t ", s-> item[i]);
     }
    }
}
  

 void main ()
 {
    int n,ch,val;
    struct stack s;
    initstack (&s);

do
{
    printf("\n 1.push\n 2.pop\n 3.display \n 4.exit");
    
     printf("\n enter case no=");
    scanf(" %d",&ch);
    switch (ch)
    {
    case 1: printf("\n enter value to push ");
               scanf("%d",&val);
               push(&s,val);
               break;

    case 2: val==pop(&s);
               printf("\n delete the value %d",val);
               break;
     case 3:  display(&s);
               break;
    }
   
} while (ch!=4);

    
} 