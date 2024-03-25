
package logica;


public class POO {

    
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(2,"Ezequiel","Nieva");
        
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("Tomas");
        alu1.setApellido("Jerez");
        
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: "+ alu1.getApellido());

    }
    
}
