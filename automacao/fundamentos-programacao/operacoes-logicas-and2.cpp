#include <iostream>
#include <cmath>
using namespace std;

int main() 
{
    // 9 é positivo E o resto da divisão de 4 com 2 e igual a 0?
    cout << ((9 > 0) && (4 % 2 == 0)) << endl; 	// true
    // 4 é maior ou igual a 4 OU 2 é diferente de 2?
    cout << ((4 >= 4) && (2 != 2)) << endl;	// false
    // 4 é menor que tres OU 2 elevado a tres é igual a 8?
    cout << ((4 < 3) && ((pow(2,3)) == 8)) << endl;	// false
    // 1 é maior que 9999 OU 987 menos 986 é negativo?
    cout << ((1 > 9999) && ((987 - 986) < 0)) << endl;	// false
}

