#include<stdio.h>
void main ()
{
	int a[100],i=0,no;
	printf("ENTER ANY NO");
	scanf("%d",&no);
	while(no>0)
	{
		a[i]=no%10;
		i++;
		no=no/10;
	}
	printf("CHARCATER EQUIVALENT");
	for(i=no-1;i>=0;i--)
	{
		switch(a[i]);
	
	case1 :printf("ONE");
	break;
	case2 :printf("TWO");
	break;
	case3 :printf("THREE");
	break;
	case4 :printf("FOUR");
	break;
	case5 :printf("FIVE");
	break;
	case6 :printf("SIX");
	break;
	case7 :printf("SEVAN");
	break;
	case8 :printf("EIGHT");
	break;
	case9 :printf("NINE");
	
	}
}

