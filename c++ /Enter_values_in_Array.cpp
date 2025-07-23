#include<iostream>
using namespace std;
#include<conio.h>
class array
{
private:
int size,*a,i;
public:
array(int n)
{
size =n;
a=new int[size];
}
void getdata();
void putdata();
};
void array::getdata()
{
cout<<"\nenter value of array  =";
for(i=0;i<size;i++)
{
cin>>a[i];
}
}
void array::putdata()
{
cout<<"\n values  of aaaray as follows =\n  ";
for(i=0;i<size;i++)
{
cout<<"\t"<<a[i] <<endl;
}
}
int main ()
{

int n ;
cout<<"\nhow many valuesa you wnat= ";
cin>>n;
array A (n);
A.getdata();
A.putdata();

}












