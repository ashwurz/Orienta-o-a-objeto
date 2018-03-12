/*
 -> Helmuth August Risch Filho		
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientacao a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando o metodo get e set
 */

#include <iostream>
#include <string>

using namespace std;

class Employee
{
public:
    // Criacao da funcao "set" para cada variavel
    void setNome( string nome )
    {
        this->nome = nome;
    }

    void setSobrenome( string sobrenome )
    {
        this->sobrenome = sobrenome;
    }

    void setSalario( double salario )
    {
        if (salario < 0)
        {
            salario = 0;
        }
        this->salario = salario;
    }

    // Criacao da funcao "get" para cada variavel
    string getNome()
    {
        return nome;
    }

    string getSobrenome()
    {
        return sobrenome;
    }

    double getSalario()
    {
        return salario;
    }

private:
    // declaracao das variaveis dentro da classe "Employee"
    string nome, sobrenome;
    double salario;
};

int main()
{
    // declaracao das variaveis que serao utilizadas
    string nome, sobrenome;
    double salario;
	// criacao dos objetos
    Employee p1, p2;

    // leitura das informacoes
    cout << "Digite o nome: ";
    cin >> nome;
    cout << "Digite o sobrenome: ";
    cin >> sobrenome;
    cout << "Digite o salario: ";
    cin >> salario;

    // insercao das variaveis no objeto p1
    p1.setNome(nome);
    p1.setSobrenome(sobrenome);
    p1.setSalario(salario);


    // leitura das informacoes
    cout << "Digite o nome: ";
    cin >> nome;
    cout << "Digite o sobrenome: ";
    cin >> sobrenome;
    cout << "Digite o salario: ";
    cin >> salario;

    // insercao das variaveis no objeto p2
    p2.setNome(nome);
    p2.setSobrenome(sobrenome);
    p2.setSalario(salario);


    //impressao de dados coletados
    cout << "Nome: " << p1.getNome() << endl;
    cout << "Sobrenome: " << p1.getSobrenome() << endl;
    cout << "Salario (mensal): " << p1.getSalario() << endl;
    cout << "Salario (anual): " << p1.getSalario() * 12 << endl;

    puts("---------------------------------");

    cout << "Nome: " << p2.getNome() << endl;
    cout << "Sobrenome: " << p2.getSobrenome() << endl;
    cout << "Salario (mensal): " << p2.getSalario() << endl;
    cout << "Salario (anual): " << p2.getSalario() * 12 << endl;

    puts("---------------------------------");

    cout << "Nome: " << p1.getNome() << endl;
    cout << "Salario (anual com o aumento): " << p1.getSalario() * 12 * 1.1 << endl;

    puts("---------------------------------");

    cout << "Nome: " << p2.getNome() << endl;
    cout << "Salario (anual com o aumento): " << p2.getSalario() * 12 * 1.1 << endl;

    return 0;
}
