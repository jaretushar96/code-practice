#include<iostream>

using namespace std;

class unary
{
private :
int a,b,c;
public:
unary()
{
a=b=c=0;
}
unary(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
void operator ++()
{
++a;
++b;
++c;
}
void operator --()
{
--a;
--b;
--c;
}
void putdata()
{
cout<<"\n value of a="<<a;
cout<<"\n value of b="<<b;
cout<<"\n value of c="<<c;
}
};
int  main()
{

unary u1,u2(30,50,100);
cout<<" \nvalue of 1 obj before ovarload =";
u1.putdata();
++u1;
cout<<"\n value after overload 1obj =";
u1.putdata();
cout <<"\nvalues of 2 obj before overload =";
u2.putdata();
cout<<"\n values after overload 2 obj =";
--u2;
u2.putdata();
return 0;
}




