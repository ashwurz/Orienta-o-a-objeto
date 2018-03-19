/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 */
#include "Complex.h"
#include <string>
#include <iostream>
using namespace std;
//Implementação do construtor Complex
Complex::Complex(double real, double imaginario){
	setReal(real);
	setImaginario(imaginario);
}
//Implementação das funções de soma
double Complex::complexSoma1(double a, double b){
	double soma1;
	soma1 = a + b;
	return soma1;
}

double Complex::complexSoma2(double c, double d){
	double soma2;
	soma2 = c + d;
	return soma2;
}
//implementação das funções de subtração
double Complex::complexSubtrai1(double e, double f){
	double subtrai1;
	subtrai1 = e - f;
	return subtrai1; 
}

double Complex::complexSubtrai2(double g, double h){
	double subtrai2;
	subtrai2 = g - h;
	return subtrai2;
}
//Implementação da função de impressão
void Complex::complexImprime(double i, double j){
	cout<<"O valor do número complexo é: "<<i;
	if(j>=0){
		cout<<"+";
	}
	cout<<j<<"i"<<endl;
}
//Implementação das funções de definição
void Complex::setReal(double real){
	this->real = real;
}

void Complex::setImaginario(double imaginario){
	this->imaginario = imaginario;
}
//Implementação das funções de "pegar" 
double Complex::getReal(){
	return real;
}

double Complex::getImaginario(){
	return imaginario;
}

