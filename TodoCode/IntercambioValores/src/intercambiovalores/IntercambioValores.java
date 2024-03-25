
package intercambiovalores;


public class IntercambioValores {

  
    public static void main(String[] args) {
       
        int num1=10;
        int num2=20;
        
        System.out.println("Num1 ="+num1+", Num2 ="+num2);
        
        int aux=num1;
        num1=num2;
        num2=aux;
        
        System.out.println("Num1 ="+num1+", Num2 ="+num2);
        
        
    }
    
}
