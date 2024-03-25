
package genericos;


public class ClaseGenerica<T> {
    
    T objecto;
    
    public ClaseGenerica(T objecto){
        this.objecto=objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+ objecto.getClass().getSimpleName());
    }
}
