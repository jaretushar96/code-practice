#include<stdio.h>
void main()
{
    int a[100],n,i,j ,k,temp;
    printf("how much term you want =");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("\n enter %d number\t",i+1);
        scanf("%d",&a[i]);
    }
     printf("\n ensorted list\n");
     for(i=0;i<n;i++)
     {
          printf(" %d \t",a[i]);
     }
     for(i=0;i<n-1;i++)
     {
        for(j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp =a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
     }
     printf("\n sorted list\n");
  for(i=0;i<n;i++)
  {
    printf(" %d \t",a[i]);
  }
 
 
 
 }