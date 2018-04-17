import java.util.Random;
/**
 * Aqui é o inicio da classe Veiculo
 */
public class Veiculo {
    
    public Random numAleatorio = new Random();///< Um objeto que tem como função gerar um número aleatório
                                              ///<
    /**
     * Aqui é criado o construtor Veiculo
     */
    public Veiculo(int cor, int velocidade)///<Construtor Veiculo, onde é passado com parametro a cor e a velocidade
                                           ///<
    {
        setIndustria(true);       
        setVelocidade(velocidade);        
        setCor(cor);
        setposX(numAleatorio.nextInt(60));
        setposY(numAleatorio.nextInt(60));
    }
    
    public void setVelocidade(int velocidade) {///< Função que define a velocidade do veiculo, é passa um valor int como parâmetro
        this.velocidade = velocidade;          ///<
    }
    
    public void setCor(int cor) {///<Função que define a cor de veiculo, é passado um valor em int como parâmetro para representar a cor
        this.cor = cor;         ///<
    }

    public void setposX(int posx) {///<Função que define a posição inicial X do veículo, a posição X do veículo é definida de forma aleatóia, através do objeto numAleatorio
        this.posx = posx;         ///<
    }

    public void setposY(int posy) {///<Função que define a posição inicial Y do veículo, a posição Y do veículo é definida de forma aleatóia, através do objeto numAleatorio
        this.posy = posy;         ///<
    }

    public void setIndustria(boolean industria) {///< Função que define a partir de um valor Boolean se um objeto criado a partir de veículo pode se clonar quando passar por uma indústria
        this.industria = industria;             ///<
    }    
    
    public int getVelocidade() {///<Função que retorna o valor da velocidade do veículo 
        return velocidade;     ///<
    }

    public int getposX() {///< Função que retorna o valor da posição inicial X
        return posx;     ///<
    }

    public int getposY() {///< Função que retorna o valor da posição inicial Y
        return posy;     ///<
    }
    
    public int getCor() {///<Função que retorna o valor que corresponde a cor do veiculo
        return cor;     ///<
    }

    
    public void acao() {///< Função que define o movimento do veículo baseado em um número aleatório que é gerado a partir do objeto numAleatorio
                        ///<
        int move = numAleatorio.nextInt(4);///<A variável move é do tipo int e vai ser usada para definir o movimento do veículo
                                           ///<
        if (move == 0){///< Condição que define o movimento para cima
                       ///<
            posy -= getVelocidade();
        }
        else if (move == 1){///<Condição que define o movimento para baixo
                            ///<
            posy += getVelocidade();
        }
        else if (move == 2){///<Condição que define o movimento do veículo para a direita
                            ///<
            posx += getVelocidade();
        }
        else if (move == 3){///<Condição que define o movimento do veículo para a esquerda
                            ///<
            posx -= getVelocidade();
        }

        if (posx < 0){///<Condição que verifica se a posição X é inferior a 0 e em caso positivo é adicionado 37 para que o veículo surja do lado oposto
                      ///<
            posx += 60;
        }
        else if (posx > 59){///<Condição que verifica se a posição X é superior a 36 e em caso positivo é subtraido em 37 para que o veículo surja do lado oposto
                            ///<
            posx -= 60;
        }
        else if (posy < 0){///<Condição que verifica se a posição Y é inferior a 0 e em caso positivo é adicionado em 37 para que o veículo surja do lado oposto
                           ///<
            posy += 60;
        }
        else if (posy > 59){///<Condição que verifica se a posição Y é superior a 36 e em caso positivo é subtraido em 37 para que o veículo surja do lado oposto
                            ///<
            posy -= 60;
        }

    }
        
    protected int posx;///<Variável que guarda a posição X do veículo 
                       ///<
    protected int posy;///<Variável que guarda a posição Y do veículo
                       ///<
    protected int velocidade;///<Variável que guarda a velocidade do veículo
                             ///<
    protected int cor;///<Variável que guarda o valor em int que representa a cor do carro
                      ///<
    protected boolean industria;///<Variável que guarda o valor em Boolean que mostra se o veículo já passou pela indústria ou não
                                ///<
}

