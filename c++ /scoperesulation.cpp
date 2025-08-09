#include <iostream>
using namespace std;

// Global variable
int globalVar = 10;

// Class definition
class MyClass {
public:
    // Member function declaration
    void display();
};

// Definition of the member function of MyClass
void MyClass::display() {
    // Accessing the global variable using the scope resolution operator
    cout << "Global variable accessed inside MyClass: " << globalVar << endl;
}

int main() {
    // Local variable with the same name as the global variable
    int globalVar = 20;

    // Accessing the local variable
    cout << "Local variable in main: " << globalVar << endl;

    // Accessing the global variable using the scope resolution operator
    cout << "Global variable in main: " << ::globalVar << endl;

    // Creating an object of MyClass
    MyClass obj;

    // Calling the member function of MyClass
    obj.display();

    return 0;
}