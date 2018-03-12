/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
//Criação da classe "Employee"
public class Employee
{
    //Declaração das variaveis dentro da classe
    private String nome;
    private String sobrenome;
    private double salario;
    //Criação da função "set"
    void setNome( String nome )
    {
        this.nome = nome;
    }

    void setSobrenome( String sobrenome )
    {
        this.sobrenome = sobrenome;
    }

    void setSalario( double salario )
    {
        if (salario < 0)
        {
            salario = 0;
        }
        this.salario = salario;
    }
    //Criação da função "get"
    String getNome()
    {
        return nome;
    }

    String getSobrenome()
    {
        return sobrenome;
    }

    double getSalario()
    {
        return salario;
    }
}
