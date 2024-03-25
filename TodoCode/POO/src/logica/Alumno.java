package logica;

public class Alumno {
     
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void mostrarNombre(){
        System.out.println("Estoy en el metodo mostrarNombre.");
    }
    
    public void saberAprobado(double calificacion){
        
        if(calificacion>=6){
            System.out.println("Aprobe la materia");
        }else{
            System.out.println("No aprobre");
        }
           
        
    }
}
