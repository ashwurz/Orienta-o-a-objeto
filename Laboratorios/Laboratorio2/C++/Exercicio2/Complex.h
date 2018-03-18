/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
#include <string>

using namespace std;
//Criação da classe Complex
class Complex
{
	public:
		//Criação do construtor
		Complex(double real, double imaginario);
		//Criação da função que soma a parte real de dois números complexos
		double complexSoma1(double a, double b);
		//Criação da função que soma a parte imaginária de dois números complexos
		double complexSoma2(double c, double d);
		//Criação da função que subtrai a parte real de dois números complexos
		double complexSubtrai1(double e, double f);
		//Criação da função que subtrai a parte imaginária de dois números complexos
		double complexSubtrai2(double g, double h);
		//Criação da função que imprime o número complexo
		void complexImprime(double i, double j);
		//Criação da função que define a parte real
		void setReal(double real);
		//Criação da função que define a parte imaginária
		void setImaginario(double imaginario);
		//Criação da função que "pega" a parte real
		double getReal();
		//Criação da função que "pega" a parte imaginária
		double getImaginario();
	private:
		//Declaração das variáveis que serão utilizadas pelo construtor
		double real;
		double imaginario;	
}; 
