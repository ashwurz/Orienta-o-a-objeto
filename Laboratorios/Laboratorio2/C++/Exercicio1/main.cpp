#include <iostream>
#include <string>
#include "Invoice.h"
int main(int argc, char** argv) {
	using namespace std;
	string ident;
	string desc;
	int quant;
	int preco;
	int valor;
	cout<<"Informe o nome do item:"<<endl;
	cin>>ident;
	cout<<"Informe uma descrição ao item:"<<endl;
	cin>>desc;
	cout<<"Informe uma quantidade:"<<endl;
	cin>>quant;
	cout<<"Informe um preço ao item:"<<endl;
	cin>>preco;
	
	Invoice item = Invoice(ident,desc,quant,preco);
	valor = item.getInvoiceAmount(item.getPreco(),item.getQuant());
	
	
	cout<<"O valor da fatura é:"<<valor<<endl;
	
	
	
	
	return 0;
}
