#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
class stco
{
private :
int len;
char *s;
public:
stco( char *str)
{
len=strlen(str);
s= new char(len+1) ;
strcpy(s,str);
strupr(s);
}
void putdata()
{
cout<<"\n\n  srring uppercas=\n\n"<<s;
}
};
void main()
{

char str[100];
cout <<"\n\n enter string =\n\n";
cin>>str;
stco s(str);
s.putdata();
 getch();
 }