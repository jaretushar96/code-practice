#include<stdio.h>
void main()
{
	int i=0,a[100],n;
	printf("enter the number  =");
	scanf("%d",&n);
	while(n>0)
	{
		a[i]=n%2;
		i++;
		n=n/2;
	}
	printf("binary no of given no :");
	for(i=i-1;i>=0;i--)
	{
		printf("%d",a[i]);
	}
	
}