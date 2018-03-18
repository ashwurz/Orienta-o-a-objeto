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
		double complexSoma1(double a, double b);
		double complexSoma2(double c, double d);
		double complexSubtrai1(double e, double f);
		double complexSubtrai2(double g, double h);
		void complexImprime(double i, double j);
		void setReal(double real);
		void setImaginario(double imaginario);
		double getReal();
		double getImaginario();
	private:
		double real;
		double imaginario;	
}; 
