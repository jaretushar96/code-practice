#include<iostream>
#include<string.h>
using namespace std;

class costr
{
private:
    int l1, l2;
    char *s;
public:
    costr(char *st1, char *st2)
    {
        l1 = strlen(st1);
        l2 = strlen(st2);
        s = new char[l1 + l2 + 1];  
        strcpy(s, st1);          
        strcat(s, st2);             
    }

    void putdata()
    {
        cout << "\n\nConcatenated string = " << s << "\n";
    }

    ~costr()
    {
        delete[] s;
    }
};

int main()
{
    char st1[20], st2[20];

    cout << "\nEnter 1st string: ";
    cin >> st1;

    cout << "Enter 2nd string: ";
    cin >> st2;

    costr s(st1, st2);
    s.putdata();

    return 0;
}
