
package rational;
import java.util.Scanner;
public class main {
    public static void main(String args[]){
        int numerador;
        int denominador;
        int escolha = 0;
        Rational resp = new Rational();
        Scanner input = new Scanner( System.in );
        
        System.out.println("Digite o valor do numerador da primeira fracao:");
        numerador = input.nextInt();
        System.out.println("Digite o valor do denominador da primeria fracao:");
        denominador = input.nextInt();
        
        Rational fracao1 = new Rational(numerador,denominador);
        
        System.out.println("Digite o valor do numerador da segunda fracao:");
        numerador = input.nextInt();
        System.out.println("Digite o valor do denominador da segunda fracao:");
        denominador = input.nextInt();
        
        Rational fracao2 = new Rational(numerador,denominador);
        
        
        while(escolha != 5){
            System.out.println("Digite 1 para Soma, 2 para Subtracao, 3 para Multiplicacao, 4 para Divisao ou 5  para sair do programa:");
            escolha = input.nextInt();
            switch(escolha){
                case 1:
                    resp = resp.somaRational(fracao1, fracao2);
                    resp.setRational(resp.getNumerador(), resp.getDenominador());
                    System.out.println(resp.toString());
                    break;
                case 2:
                    resp = resp.subtracaoRational(fracao1, fracao2);
                    resp.setRational(resp.getNumerador(), resp.getDenominador());
                    System.out.println(resp.toString());
                    break;
                case 3:
                    resp = resp.multiplicaoRational(fracao1, fracao2);
                    resp.setRational(resp.getNumerador(), resp.getDenominador());
                    System.out.println(resp.toString());
                    break;
                case 4:
                    resp = resp.divisaoRational(fracao1, fracao2);
                    resp.setRational(resp.getNumerador(), resp.getDenominador());
                    System.out.println(resp.toString());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("OPCAO INVALIDAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!");
            }
        }
    }
}
