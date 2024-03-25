
package ejercicio6poo;


public class Cafeteria {
    
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafeteria() {
    }

    public Cafeteria(int capacidadMaxima, int catidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = catidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=1;
    }
    
    public void servirTaza(int tamanio){
        if(cantidadActual!=0){
          System.out.println("Taza llenada de cafe.");  
        }else{
          System.out.println("Llenar cafetera");
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    public void agregarCafe(int cafe){
        System.out.println("Se le añadio la cantidad de cafe.");
    }
    
}
