#include<stdio.h>
int main()
{
    int a[50],n,low,val,mid,high,i;
    printf("\n how many terms you want =");
    scanf("%d",&n);
    printf(" \n enter terms in array \n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf(" \n enter value to search =");
    scanf("%d",&val);
    low=0;
    high=n-1;
    if(val>=a[low]&&val<=a[high])
    {

    while (low<=high)
    {
     mid=(low+high)/2;
     if(val<a[mid])
     {
        high=mid-1;
     }
     else if(val>a[mid])
     {
        low=mid+1;
     }
     else if(val==a[mid])
     {
        printf("\n %d is preasent at %d position ",val,mid+1);
        exit(1);
        
     }
    }
    }
    else{

         printf("\n %d is absent",val);
        }
  

    return 0;
    
}