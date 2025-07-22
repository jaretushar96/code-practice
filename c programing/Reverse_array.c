#include<stdio.h>
void main()
{
	int i,a[100],n;
	printf(" how many terms you want in arry=");
	scanf("%d",&n);
	printf("enter terms for array \n");
	for(i=0;i<n;i++)
	{
	
	scanf("%d\n",&a[i]);
}


		printf("values if array in reverse \n=");
	for(i=n-1;i>=0;i--)
{
	
	printf("%d\n",a[i]);
	
}
}
