
package rational;

public class Rational {
    private int numerador;
    private int denominador;
    
    Rational(int numerador, int denominador){
        setRational(numerador,denominador);
    }
    Rational(){
        
    };
    
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
    
    public int getDenominador(){
        return denominador;
    }
    public int getNumerador(){
        return numerador;
    }
    
    public String toString(){
        return String.format("%d / %d", getNumerador(), getDenominador());      
    }
    
    public Rational somaRational(Rational a, Rational b ){
       Rational soma = new Rational(((a.getNumerador() * b.getDenominador()) + (b.getNumerador() * a.getDenominador())),(a.getDenominador() * b.getDenominador()));
       return soma;
    }
    public Rational subtracaoRational(Rational a, Rational b ){
      Rational subtracao = new Rational(((a.getNumerador() * b.getDenominador()) - (b.getNumerador() * a.getDenominador())),(a.getDenominador() * b.getDenominador()));
      return subtracao;
    }
    public Rational multiplicaoRational(Rational a, Rational b ){
      Rational multiplicao = new Rational(a.getNumerador() * b.getNumerador(), a.getDenominador() * b.getDenominador());
      return multiplicao;
    }
    public Rational divisaoRational(Rational a, Rational b ){
      Rational divisao = new Rational(a.getNumerador() * b.getDenominador(),a.getDenominador()*b.getNumerador());
      return divisao;
    }
}
