#include<iostream>

using namespace std;
class copyconstr
{
private:
int a,b;
public:
copyconstr(int x,int y)
{
a=x;
b=y;
}
copyconstr(copyconstr &obj)
{
a=obj.a;
b=obj.b;
}
void show()
{
cout<<"\nvalue ot a="<<a;
cout<<"\n value of b="<<b;
 }
 };
 int main()
 {

 copyconstr c1(10,20);
 copyconstr c2=c1;
 copyconstr c3(c1);
 cout<<"\nvalue of 1 obj =";
 c1.show();
 cout<<"\n value of 2obj =";
 c2.show();
 cout<<"\n value of 3 obj =";
 c3.show();

 }
