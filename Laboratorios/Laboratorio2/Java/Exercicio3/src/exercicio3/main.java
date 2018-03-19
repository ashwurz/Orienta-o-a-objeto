/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
package exercicio3;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        //Declaração das variáveis
        float width;
        float lenght;
        int escolha;
        float perimetro;
        float area;
        Scanner input = new Scanner(System.in);
        //O usuário define o valor das variáveis
        System.out.println("Digite o valor da largura do retangulo:");
        width = input.nextFloat();
        System.out.println("Digite o valo do comprimento do retangulo:");
        lenght = input.nextFloat();
        //Criação do objeto Rectangle
        Rectangle retangulo = new Rectangle(lenght,width);
        //O usuário escolhe entre o calculo da area ou do perimetro
        System.out.println("Digite 1 para area ou 2 para perimetro:");
        escolha = input.nextInt();
        if(escolha == 1){
            area = retangulo.Area(retangulo.getLenght(), retangulo.getWidth());
            System.out.println("O valor da area é: " + area);
        }
        else if(escolha == 2){
            perimetro = retangulo.Perimetro(retangulo.getLenght(), retangulo.getWidth());
            System.out.println("O valor do perimetro é:" + perimetro);
        }
    }   
    
}
