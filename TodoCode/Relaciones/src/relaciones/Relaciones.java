package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {

        Auto auto = new Auto();
        
        auto.setId(1l);
        auto.setMarca("Renault");
        auto.setModelo("Duster");
        
        List<Propietario> lista = new ArrayList<Propietario>();
        
        Propietario prop1 = new Propietario(35L, "EZEQUIEL","NIEVA");
        Propietario prop2 = new Propietario(30L, "REMIGIO","NIEVA");
        
        lista.add(prop2);
        lista.add(prop1);
        
        auto.setListaProp(lista);
        
        System.out.println("El auto " + auto.getMarca()+" "+ auto.getModelo()+ " tiene como propietario a: " + auto.getListaProp().toString());
    }
    
}
