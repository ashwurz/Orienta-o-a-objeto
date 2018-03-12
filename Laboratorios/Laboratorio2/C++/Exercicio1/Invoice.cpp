#include "Invoice.h"

Invoice::Invoice(string ident,string desc,int quant,int preco){
	setIdent(ident);
	setDesc(desc);
	setQuant(quant);
	setPreco(preco);
}

int Invoice::getInvoiceAmount(int a, int b){
	int multiplica = a * b;
	return multiplica;
}

void Invoice::setDesc(string desc){
	this->desc = desc;
}

void Invoice::setIdent(string ident){
	this->ident = ident;
}

void Invoice::setPreco(int preco){
	if(preco<0){
		preco = 0;
	}
	this->preco = preco;
}

void Invoice::setQuant(int quant){
	if(quant<0){
		quant = 0;
	}
	this->quant = quant;
}

string Invoice::getDesc(){
	return desc;
}

string Invoice::getIdent(){
	return ident;
}

int Invoice::getPreco(){
	return preco;
}

int Invoice::getQuant(){
	return quant;
}
