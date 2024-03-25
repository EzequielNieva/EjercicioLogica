package coversiones;

public class Coversiones {

    public static void main(String[] args) {

        double num = 1.75;
        
        //casteo a entero
        int numInt= (int) num;
        
        //casteo a long
        long numLong = (long) num;
        
        //casteo a String
        String numString= String.valueOf(numLong);
        
        System.out.println("double: " + num);
        System.out.println("itn: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("String: " +numString);

        String cantidad="15";
        String precio= "150.27";
        
        int cantEntero= Integer.parseInt(cantidad);
        double precioDouble= Double.parseDouble(precio);
        
        System.out.println("cantidad Entero: "+cantEntero );
        System.out.println("precio Double: "+precioDouble);
        
        
        
        
    }
    
}
