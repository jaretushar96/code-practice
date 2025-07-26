#include<iostream>
using namespace std;
class student
{
private:
int sno,m1,m2,m3,to;
float per;
char name[10];
public:
void getdata ();
void calculate();
void putdata();
};
void student::getdata()
{
cout<<"\nenter the value of sno,name,m1,m2,m3=\n";
cin>>sno>>name>>m1>>m2>>m3;
}
void student::calculate ()
{
to=m1+m2+m3;
per=(float)to/3;
}
void student::putdata()
{
cout<<"\nseat no="<<sno<<"\nname ="<<name<<"\nM1="<<m1<<"\nM2="<<m2<<"\nM3="<<m3<<"\nTotal marks=" <<to<<"\n percentage="<<per;
}
int main()
{

student s[5];
int i;
cout<<"\nenter data of 2 student=\n";
for(i=0;i<2;i++)
{
s[i].getdata();
s[i].calculate();
}
for(i=0;i<2;i++)
{
cout<<"\n\ndetails of "<<i+1<<"student=";
s[i].putdata();
}

}
