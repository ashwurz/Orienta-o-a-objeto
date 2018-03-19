/*
 -> Helmuth August Risch Filho 
 -> RA: 22.117.038-4
 ->
 -> CC3642 - Orientação a Objetos
 ->
 */
package rational;
//Criação da classe Rational
public class Rational {
    //Declaração das variáveis
    private int numerador;
    private int denominador;
    //Criação dos construtores
    Rational(int numerador, int denominador){
        setRational(numerador,denominador);
    }
    Rational(){
        
    };
    //Método que define e simplifica uma fração
    public void setRational(int numerador, int denominador){
        int i;
        int mdc;
        if(numerador > denominador){
            mdc = denominador;
        }
        else{
            mdc = numerador;
        }
        for(i = mdc; i > 1; i--){
            if(numerador % i == 0 && denominador % i ==0){
                numerador = numerador / i;
                denominador = denominador / i;
            }
        }
        this.denominador = denominador;
        this.numerador = numerador;
    }
    //Funções que "pegam" os valores
    public int getDenominador(){
        return denominador;
    }
    public int getNumerador(){
        return numerador;
    }
    //Função que transforma em String
    public String toString(){
        return String.format("%d / %d", getNumerador(), getDenominador());      
    }
    //Função de soma de numeros racionais
    public Rational somaRational(Rational a, Rational b ){
       Rational soma = new Rational(((a.getNumerador() * b.getDenominador()) + (b.getNumerador() * a.getDenominador())),(a.getDenominador() * b.getDenominador()));
       return soma;
    }
    //Função de subtração de numeros racionais
    public Rational subtracaoRational(Rational a, Rational b ){
      Rational subtracao = new Rational(((a.getNumerador() * b.getDenominador()) - (b.getNumerador() * a.getDenominador())),(a.getDenominador() * b.getDenominador()));
      return subtracao;
    }
    //Função de multiplicação de numeros racionais
    public Rational multiplicaoRational(Rational a, Rational b ){
      Rational multiplicao = new Rational(a.getNumerador() * b.getNumerador(), a.getDenominador() * b.getDenominador());
      return multiplicao;
    }
    //Função de divisão de numeros racionais
    public Rational divisaoRational(Rational a, Rational b ){
      Rational divisao = new Rational(a.getNumerador() * b.getDenominador(),a.getDenominador()*b.getNumerador());
      return divisao;
    }
}
