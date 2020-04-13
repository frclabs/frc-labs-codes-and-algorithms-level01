#include <iostream>
using namespace std;

int main() 
{
    cout << (true || true) << endl;  // true
    cout << (true || false) << endl; // true
    cout << (false || true) << endl; // true
    cout << (false || false) << endl;// false

    return 0;
}