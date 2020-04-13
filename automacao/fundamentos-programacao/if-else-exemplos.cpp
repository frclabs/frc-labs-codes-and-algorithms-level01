#include <iostream>
using namespace std;

int main() 
{
    // Vamos ver se um numero é par...
    int num = 10;
    if ((num % 2) == 0) 
    { // Se o resto da divisão for for zero
        cout << "Esse número é par" << endl;
    } 
    else
    {                
        cout << "Esse número é impar" << endl;
    } 

    return 0;
}
