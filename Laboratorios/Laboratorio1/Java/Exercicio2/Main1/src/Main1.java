/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
import java.util.Scanner;
//Criação da classe "Main"
public class Main1 {

    public static void main(String[] args) {
         //Criação da função "input", para que o usuário possa digitar algo
        Scanner input = new Scanner( System.in );
        //Criação dos objetos
        DateTest data = new DateTest();
        //Declaração das variaveis
        int dia, mes, ano;
        //usuário define o valor das variáveis
        System.out.print("Dia: ");
        dia = input.nextInt();
        System.out.print("Mes: ");
        mes = input.nextInt();
        System.out.print("Ano: ");
        ano = input.nextInt();
        //Guarda os respectivos valores no objeto data
        data.setDia( dia );
        data.setMes( mes );
        data.setAno( ano );
        //Função que printa os valores do objeto na tela
        data.displayDate();

    }
}
