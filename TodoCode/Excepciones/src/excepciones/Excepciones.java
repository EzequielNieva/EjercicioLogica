
package excepciones;


public class Excepciones {

    
    public static void main(String[] args) {
        

        try{
            int resultado = 3/0;
        }catch(Exception e){
            System.out.println("No se puede dividir por 0");
        }
        
          int edades[]={10,11,12,13};
        try{
        System.out.println("La edad de la posicion 4 es: "+ edades[4]);
        }catch(Exception e){
            System.out.println("El indice no existe");
        }
        
    }
    
}
