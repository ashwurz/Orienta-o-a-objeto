/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 */
package time2;


import java.util.Scanner;
public class main
{

    public static void main(String[] args)
    {
        //Criação do objeto
        Time2 horario = new Time2(22, 58, 59);
        //Imprime o horario atual
        System.out.println(horario.toString());
        //Chamando a função de incrementar hora
        horario.incrementHour();
        //Chamadno a função de incrementar minuto
        horario.incrementMinute();
        //Chamando a função de incrementar segundo
        horario.tick();
        //Impressão do resultado em String
        System.out.println(horario.toString());

    }
}
