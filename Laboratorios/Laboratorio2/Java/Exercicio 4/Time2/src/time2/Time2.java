/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 -> O programa faz a leitura do nome, sobrenome e salario de duas pessoas e imprime todas as leituras, utilizando as funções get e set
 */
package time2;

public class Time2
{
    private int hour;       // 0 - 23
    private int minute;     // 0 - 59
    private int second;     // 0 - 59


    // construtor sem argumento Time2 : inicializa cada variåvel de inståncia
    public Time2() {
        this(0, 0, 0); // invoca o construtor Time2 com trés argumentos
    }// fim do construtor sem argumento Time2

    // com zero: assegura que objetos Time2 iniciam em um estado consistente
    // Construtor Time2: hora fornecida, minuto e segundo padronizados para 0

    public Time2( int h )
    {
        this( h, 0, 0 ) ; // invoca o construtor Time2 com trés argumentos
    } // fim do construtor de um argumento Time2

    // Construtor Time2: hora e minuto fornecidos, segundo padronizado para 0

    public Time2( int h, int m )
    {
        this( h, m, 0 ) ; // invoca o construtor Time2 com trés argumentos
    } // fim do construtor de dois argumentos Time2
    // Construtor Time2: hour, minute e second fornecidos

    public Time2( int h, int m, int s )
    {
        setTime( h, m, s ) ; // invoca setTime para validar a data/hora
    } // fim do construtor de trés argumentos Time2

    // Construor Time2: outro objeto Time2 fornecido

    public Time2( Time2 time )
    {
        // invoca o construtor de tres argumentos Time2
        this( time.getHour(), time.getMinute(), time.getSecond() );
    } // fim do construtor Time2 com um argumento de objeto Time2

    // Metodos set
    // confira um novo valor de data/hora usando  UTC; assegura que
    // os dados permanecam consistentes configurado valores invalidos como zero
    public void setTime( int h, int m, int s)
    {
        setHour( h );    // configura hour
        setMinute( m );  // configura minute
        setSecond( s );  // configura second
    } // fim do metodo setTime

    // valida e configura a hora
    public void setHour(int hour) {
        this.hour = hour;
    } // fim do metodo setHour

    // valida e configura a minutos
    public void setMinute(int minute) {
        this.minute = minute;
    } // fim do metodo setMinute

    // valida e configura a minutos
    public void setSecond(int second) {
        this.second = second;
    } // fim do metodo setSecond

    // Metodos get
    // obtem valor da hora

    public int getHour() {
        return hour;
    } // fim do metodo getHour

    // obtem valor do minuto
    public int getMinute() {
        return minute;
    } // fim do metodo getMinute

    // obtem valor do segundo
    public int getSecond() {
        return second;
    } // fim do metodo getSecond

    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format(
                "%02d:%02d%02d:%02d", getHour(), getMinute(), getSecond()
        );
    } // fim do metodo do toUniversalString

    // converte em String no formato padrao de data/hora (H:MM:SS AM ou PM)


    public String toString() {
        return String.format( "%d:%02d:%02d %s", ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
        getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
    }// fim do metodo toString

    public void tick()
    {
        if (getSecond() + 1 < 60)
        {
            setSecond(getSecond() + 1);
        }
        else if (getMinute() + 1 < 60)
        {
            setSecond(0);
            setMinute(getMinute() + 1);
        }
        else if (getHour() + 1 < 24)
        {
            setSecond(0);
            setMinute(0);
            setHour(getHour() + 1);
        }
        else
        {
            setSecond(0);
            setMinute(0);
            setHour(getHour() + 1 - 24);
        }
    }

    public void incrementMinute()
    {
        if (getMinute() + 1 < 60)
        {
            setMinute(getMinute() + 1);
        }
        else if (getHour() + 1 < 24)
        {
            setMinute(0);
            setHour(getHour() + 1);
        }
        else
        {
            setMinute(0);
            setHour(getHour() + 1 - 24);
        }
    }

    public void incrementHour()
    {
        if (getHour() + 1 < 24)
        {
            setHour(getHour() + 1);
        }
        else
        {
            setHour(getHour() + 1 - 24);
        }
    }
}// fim da classe Time2
