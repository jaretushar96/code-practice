#include<iostream>

using namespace std;
class postincr
{
private :
int a,b,c;
public:
void getdata ()
 {
 cout<<"\n enter value of a,b,c=";
 cin>>a>>b>>c;
 }
void operator ++(int)
{
a++;
b++;
c++;
}
void putata()
{
 cout<<"\n value of  \n A="<<a <<"\n b="<<b<<"\n C="<<c ;
}
};
int main()
{

postincr i ;
i.getdata();
i++;
i.putata();

}