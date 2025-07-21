#include<stdio.h>
void main ()
{
	int b,a[10],n,i,c=0;
	printf("how many terms you want=");
	scanf("%d",&n);
	printf("enter values\n");
	for(i=0;i<n;i++)
	{
	scanf("%d",&a[i]);
    }
    printf("\nenter no fof finding in series=");
    scanf("%d",&b);
    for(i=0;i<n;i++)
    {
    	if(a[i]==b);
    	{
	c++;
	printf("%d%d",b,(i+1));
	    }
	}
	if(i==n)
	{
		printf("%d is abseent",b);
		
	}
	else
	{
		printf("%d is present and %d times",b,i+1);
	}
}
