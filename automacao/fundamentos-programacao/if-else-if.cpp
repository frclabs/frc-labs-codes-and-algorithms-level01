#include <iostream>
using namespace std;

int main() 
{ 
	bool expressao = false;
	bool expressao2 = true; 
	if (expressao) 
	{
		cout << "A expressão \"expressao\" é verdadeira!" << endl;
	} 
	else if (expressao2)
	{
		cout << "A expressão \"expressao2\" é verdadeira!" << endl;		
	} 
	else
	{
		cout << "Nenhuma expressão é verdadeira!" << endl;
	}
	return 0;
}

