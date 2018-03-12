#include <iostream>
#include "Complex.h"
#include <string>

int main(int argc, char** argv) {
	using namespace std;
	double real;
	double imaginario;
	double numeroComplexo;
	double somaReal;
	double somaImaginario;
	double subtraiReal;
	double subtraiImaginario;
	int escolha;
	
	cout<<"Informe a parte real do numero complexo:"<<endl;
	cin>>real;
	cout<<"Informe a parte imaginaria do numero complexo"<<endl;
	cin>>imaginario;
	
	Complex complexo1 = Complex(real,imaginario);
	
	cout<<"Informe a parte real do segundo numero complexo:"<<endl;
	cin>>real;
	cout<<"Informe a parte imaginaria do segundo numero complexo:"<<endl;
	cin>>imaginario;
	
	Complex complexo2 = Complex(real,imaginario);
	cout<<"Digite 1 para soma de numeros complexos ou 2 para subtracao de numeros complexos:"<<endl;
	cin>>escolha;
	
	if(escolha == 1){
		somaReal = complexo1.complexSoma1(complexo1.getReal(), complexo2.getReal());
		somaImaginario = complexo1.complexSoma2(complexo1.getImaginario(),complexo2.getImaginario());
		complexo1.complexImprime(somaReal, somaImaginario);
	}
	
	if(escolha == 2){
		subtraiReal = complexo1.complexSubtrai1(complexo1.getReal(),complexo2.getReal());
		subtraiImaginario = complexo1.complexSubtrai2(complexo1.getImaginario(),complexo2.getImaginario());
		complexo1.complexImprime(subtraiReal, subtraiImaginario);
	}
	
	
	return 0;
}
