package bucleinfitino;

public class BucleInfitino {

    public static void main(String[] args) {
        
        int cont=0;
        //Bucle infinito por contador
        while(cont <= 10 ){
            
            System.out.println("Estoy en la vuelta " + cont);
            
//            cont = cont +1 ;
            
//          cont++;
        }
        
        //Bucle infinito por centinela 
        
        boolean centinela= true;
        
        while(centinela==true){
            System.out.println("El valor de la bandera es : "+ centinela);
        //centinela= false;
            
        }

    }
    
}
