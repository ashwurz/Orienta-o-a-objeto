/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
#include <iostream>
#include <string>
#include "Invoice.h"
int main(int argc, char** argv) {
	using namespace std;
	//Declaração das variáveis que serão utilizadas no código
	string ident;
	string desc;
	int quant;
	int preco;
	int valor;
	//O usuário informa o valor das variáveis
	cout<<"Informe o nome do item:"<<endl;
	cin>>ident;
	cout<<"Informe uma descrição ao item:"<<endl;
	cin>>desc;
	cout<<"Informe uma quantidade:"<<endl;
	cin>>quant;
	cout<<"Informe um preço ao item:"<<endl;
	cin>>preco;
	//Criação do objeto
	Invoice item = Invoice(ident,desc,quant,preco);
	//Chamando a função getInvoiceAmount para o calculo do valor da fatura
	valor = item.getInvoiceAmount(item.getPreco(),item.getQuant());
	
	//Impressão do valor da fatura
	cout<<"O valor da fatura é:"<<valor<<endl;
	
	
	
	
	return 0;
}
