#include <iostream>
using namespace std;

int main() 
{
	int num = -5;
	if (num > 0) 
	{
		cout << "O número é maior que zero" << endl;
	}
	else if (num < 0) 
	{
		cout << "O número é menor que zero" << endl;
	}
	else {
		cout << "O número é igual a zero." << endl;
	}

	int operacao = 2;
	if (operacao == 1) 
	{
		cout << "Executando a operação 1" << endl;
	}
	else if (operacao == 2) 
	{
		cout << "Executando a operação 2" << endl;
	}
	else if (operacao == 3) 
	{
		cout << "Executando a operação 3" << endl;
	}
	else 
	{
		cout << "Operação inválida." << endl;
	}

	return 0;
}