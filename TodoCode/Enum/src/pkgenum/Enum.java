
package pkgenum;

import pkgenum.enums.Color;


public class Enum {

//    enum Color{
//        ROJO,AZUL,VERDE,AMARRILO,ANARANJADO,NEGRO,BLANCO
//    }
    
    
    public static void main(String[] args) {

//        Color color = Color.ROJO;   
//        System.out.println("color = " + color);
        
           for (Color c : Color.values()) {
               System.out.println("color = " + c);
        }
            
           Color col = Color.AZUL;
           System.out.println(col.name());
           System.out.println(col.ordinal());
           col = Color.valueOf("AZ UL");
           System.out.println("Encontre: " + col);
    }
    
}
