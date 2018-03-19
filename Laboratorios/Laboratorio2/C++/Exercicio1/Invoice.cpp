/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 */
#include "Invoice.h"
//Implementação do construtor
Invoice::Invoice(string ident,string desc,int quant,int preco){
	setIdent(ident);
	setDesc(desc);
	setQuant(quant);
	setPreco(preco);
}
//Implementação da função getInvoiceAmount
int Invoice::getInvoiceAmount(int a, int b){
	int multiplica = a * b;
	return multiplica;
}
//Implementação da função setDesc
void Invoice::setDesc(string desc){
	this->desc = desc;
}
//Implementação da função setIdent
void Invoice::setIdent(string ident){
	this->ident = ident;
}
//Implementação da função setPreco
void Invoice::setPreco(int preco){
	if(preco<0){
		preco = 0;
	}
	this->preco = preco;
}
//Implementação da função setQuant
void Invoice::setQuant(int quant){
	if(quant<0){
		quant = 0;
	}
	this->quant = quant;
}
//Implementação da função getDesc
string Invoice::getDesc(){
	return desc;
}
//Implementação da função getIdent
string Invoice::getIdent(){
	return ident;
}
//Implementação da função getPreco
int Invoice::getPreco(){
	return preco;
}
//Implementação da função getQuant
int Invoice::getQuant(){
	return quant;
}
