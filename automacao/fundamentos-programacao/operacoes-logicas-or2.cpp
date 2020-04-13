#include <iostream>
#include <cmath>
using namespace std;

int main() 
{
    // 9 é positivo OU o resto da divisao de 4 com 2 é igual a 0?
    cout << ((9 > 0) || (4 % 2 == 0)) << endl; 	// true
    // 4 é maior ou igual a 4 OU 2 é diferente de 2?
    cout << ((4 >= 4) || (2 != 2)) << endl;	// true
    // 4 é menor que tres OU 2 elevado a tres é igual a 8?
    cout << ((4 < 3) || ((pow(2, 3)) == 8)) << endl;	// true
    // 1 é maior que 9999 OU 987 menos 986 é negativo?
    cout << ((1 > 9999) || ((987 - 986) < 0)) << endl;	// false

    return 0;
}

