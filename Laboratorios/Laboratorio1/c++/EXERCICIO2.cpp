/*
 -> Helmuth August Risch FIlho
 -> RA: 22.117.028-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do dia, mes e ano de uma data e imprime todas as leituras, utilizando as funções get e set.
 */
 
#include <iostream>
#include <string>

using namespace std;

class Date
{
public:
	// Criacao da funcao "set" para cada variavel
    void setDia( int dia )
    {
        this->dia = dia;
    }

    void setMes( int mes )
    {
        this->mes = mes;
    }

    void setAno( int mes )
    {
        this->ano = mes;
    }
	// Criacao da funcao "get" para cada variavel
    int getDia()
    {
        return dia;
    }

    int getMes()
    {
        return mes;
    }

    int getAno()
    {
        return ano;
    }
	//Função que imprime a data "dia/mes/ano" na tela.
    void displayDate ()
    {
        cout << getDia() << "/" << getMes() << "/" << getAno() << endl;
    }


private:
	// declaracao das variaveis dentro da classe "Employee"
    int dia, mes, ano;
};

int main()
{
	// criacao dos objetos
    Date data;
    // declaracao das variaveis que serao utilizadas
    int dia, mes, ano;
	// leitura das informacoes
    cout << "Digite o dia: ";
    cin >> dia;
    cout << "Digite o mes: ";
    cin >> mes;
    cout << "Digite o ano: ";
    cin >> ano;
	// insercao das variaveis no objeto data
    data.setDia(dia);
    data.setMes(mes);
    data.setAno(ano);
	//impressao de dados coletados
    data.displayDate();


    return 0;
}
