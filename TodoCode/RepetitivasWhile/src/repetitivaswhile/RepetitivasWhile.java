package repetitivaswhile;

public class RepetitivasWhile {
 
    public static void main(String[] args) {

        int cont=0;
        
        while(cont <= 10 ){
            
            System.out.println("Estoy en la vuelta " + cont);
            
            cont = cont +1 ;
            
//          cont++;
        }

        do{
            System.out.println("Estoy en la vuelta " + cont);
            
            cont = cont +1 ;
            
        }while(cont <= 10);
    }
    
}
