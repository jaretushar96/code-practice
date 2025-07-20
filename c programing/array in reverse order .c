#include<stdio.h>
void main ()
{
	int a[10],i,n;
	printf("how many terms you wnat =");
	scanf("%d",&n);
	printf("enter the values of array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("valuees of array in reverse order");
	for(i=n-1;i>=0;i--);
	{
		printf("%d\n",a[i]);
	}
}
