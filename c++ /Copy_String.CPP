#include<iostream>
#include<string.h>
#include<conio.h>
using namespace std;
class stringconstructor
{
private:
int len;
char * s;
public:
stringconstructor ( char *str)
{
len=strlen(str);
s=new char[len+1];
strcpy(s,str);
}
void putdata()
{
cout<<"\n copied string ="<<s;
}
};
int main()
{

char str[20];
cout<<"\n enter string=";
cin>>str;
stringconstructor s(str);
s.putdata();

}