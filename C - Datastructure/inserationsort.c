#include<stdio.h>
void main()
{
    int a[100];
    int n,i,j ,k,temp;
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

      for(j=1;j<n;j++)
      {
        k=a[j];
        for(i=j-1;i>=0&& k<a[i];i--)
        {
            a[i+1]=a[i];
        }
        a[i+1]=k;
      }

       printf("\n sorted list\n");
  for(i=0;i<n;i++)
  {
    printf(" %d \t",a[i]);
  }
 
 
 
 }