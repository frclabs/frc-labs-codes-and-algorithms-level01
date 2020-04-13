#include <iostream>
using namespace std;

int main() 
{
    // Vamos ver se um número é par...
    int num = 10;
    if ((num % 2) == 0) 
    { // Se o resto da divisão for for zero
        cout << "Esse número é par" << endl;
    }

    if (!(1 >= 99)) 
    {
        cout << "1 < 99" << endl;
    }

    // Testando com o operador and
    if (true && true) 
    {
        cout << "true && true" << endl;
    }

    if (true && false) 
    {
        cout << "true && false" << endl;
    }

    if (false && true) 
    {
        cout << "false && true" << endl;
    }

    if (false && false)
    {
        cout << "false && false" << endl;
    }

    // Testando com o operador or
    if (true || true)
    {
        cout << "true || true" << endl;
    }

    if (true || false)
    {
        cout << "true || false" << endl;
    }

    if (false || true)
    {
        cout << "false || true" << endl;
    }

    if (false || false)
    {
        cout << "false || false" << endl;
    }

    // Testando com operadores lógicos
    if (true && ! (false || ! true))
    {
        cout << "true && true" << endl;
    }

    // Vamos ver se um numero é par e positivo
    num = 10;
    if (num % 2 == 0)
    {
        if (num > 0)
        {
            cout << "O número é par e positivo" << endl;
        }
    }
}


