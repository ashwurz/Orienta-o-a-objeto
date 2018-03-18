
package time2;


import java.util.Scanner;
public class main
{

    public static void main(String[] args)
    {
        Time2 horario = new Time2(22, 58, 59);

        System.out.println(horario.toString());

        horario.incrementHour();
        horario.incrementMinute();
        horario.tick();

        System.out.println(horario.toString());

    }
}