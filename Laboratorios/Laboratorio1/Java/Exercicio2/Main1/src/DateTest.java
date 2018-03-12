/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
//Criação da classe "DateTest"
public class DateTest
{
    //Declaração das variaveis dentro da classe
    private int dia, mes, ano;
    //Criação da função "set"
    public void setDia( int dia )
    {
        this.dia = dia;
    }

    public void setMes( int mes )
    {
        this.mes = mes;
    }

    public void setAno( int ano )
    {
        this.ano = ano;
    }
    //Criação da função "get"
    public int getDia()
    {
        return dia;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAno()
    {
        return ano;
    }
    //Criação da função que printa a data na tela
    public void displayDate ()
    {
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }

}
