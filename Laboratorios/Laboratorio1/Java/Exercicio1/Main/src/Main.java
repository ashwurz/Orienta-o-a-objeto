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
public class Main {

    public static void main(String[] args) {
  //Criação da função "input", para que o usuário possa digitar algo
        Scanner input = new Scanner( System.in );
        //Criação dos objetos
        Employee p1 = new Employee();
        Employee p2 = new Employee();
        //Declaração das variaveis
        String nome;
        String sobrenome;
        double salario;
        //usuário define o valor das variáveis
        System.out.print("Digite o nome: ");
        nome = input.next();
        System.out.print("Digite o CPF: ");
        sobrenome = input.next();
        System.out.print("Digite o salario: ");
        salario = input.nextDouble();
        //Guarda os respectivos valores no objeto "p1"
        p1.setNome( nome );
        p1.setSobrenome( sobrenome );
        p1.setSalario( salario );

        //usuário define o valor das variáveis
        System.out.print("Digite o nome: ");
        nome = input.next();
        System.out.print("Digite o CPF: ");
        sobrenome = input.next();
        System.out.print("Digite o salario: ");
        salario = input.nextDouble();
        //Guarda os respectivos valores no objeto "p2"
        p2.setNome( nome );
        p2.setSobrenome( sobrenome );
        p2.setSalario( salario );
        //Impressão dos valores dos objetos
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getSobrenome());
        System.out.println("Salario (mensal): " + p1.getSalario());
        System.out.println("Salario (anual): " + p1.getSalario() * 12);

        System.out.println("---------------------------------");

        System.out.println("Nome: " + p2.getNome());
        System.out.println("CPF: " + p2.getSobrenome());
        System.out.println("Salario (mensal): " + p2.getSalario());
        System.out.println("Salario (anual): " + p2.getSalario() * 12);

        System.out.println("---------------------------------");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Salario (anual com o aumento): " + p1.getSalario() * 12 * 1.1);

        System.out.println("---------------------------------");

        System.out.println("Nome: " + p2.getNome());
        System.out.println("Salario (anual com o aumento): " + p2.getSalario() * 12 * 1.1);

    }
}

