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
//criação da classe "Invoice"
class Invoice
{
	public:
		//Criação do construtor
		Invoice(string ident, string desc, int quant, int preco);
		//Criação da função getInvoiceAmount
		int getInvoiceAmount(int a, int b);
		//Criação da função setIdent
		void setIdent(string ident);
		//Criação da função setDesc
		void setDesc(string desc);
		//Criação da função setQuant
		void setQuant(int quant);
		//Criação da função setPreco
		void setPreco(int preco);
		//Criação da função getIdent
		string getIdent();
		//Criação da função getDesc
		string getDesc();
		//Criação da função getQuant
		int getQuant();
		//Criação da função getPreco
		int getPreco();
	
	private:
		//Declaração da variável ident
		string ident;
		//Declaração da variável desc
		string desc;
		//Declaração da variável quant
		int quant;
		//Declaração da variável preco
		int preco;
};
