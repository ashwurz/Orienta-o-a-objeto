package exercicio3;

public class Rectangle {
    private float lenght;
    private float width;
    
    Rectangle(float lenght, float width){
        setLenght(lenght);
        setWidth(width);
    }
    
   public void setLenght(float lenght){
       if(lenght > 0 && lenght < 20){
           this.lenght = lenght;
       }
       else{
           this.lenght = 0;
           System.out.println("O valor tem que estar entre 0 e 20!!");
       }
   }      
   
    public void setWidth(float width){
       if(width < 20 && width > 0){
           this.width = width;
       }
       else{
           this.width = 0;
           System.out.println("O valor tem que estar entre 0 e 20!!");
       }
   }
    
    public float getLenght(){
        return lenght;
    }
    
    public float getWidth(){
        return width;
    }
    
    public float Perimetro(float a, float b){
        float lado1 = 2 * a;
        float lado2 = 2 * b;
        float perimetro = lado1 + lado2;
        
        return perimetro;
    }
    
    public float Area(float c, float d){
        float area = c * d;
        return area;
    }
}