package exercicio3;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        float width;
        float lenght;
        int escolha;
        float perimetro;
        float area;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da largura do retangulo:");
        width = input.nextFloat();
        System.out.println("Digite o valo do comprimento do retangulo:");
        lenght = input.nextFloat();
        
        Rectangle retangulo = new Rectangle(lenght,width);
        
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
