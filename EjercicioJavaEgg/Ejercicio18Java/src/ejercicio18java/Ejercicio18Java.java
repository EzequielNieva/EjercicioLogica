
package ejercicio18java;


public class Ejercicio18Java {

    
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    
                    if (i == 3) {
                        System.out.println("E-" + j + "-" + k);
                    } else if (j == 3) {
                        System.out.println(i + "-E-" + k);
                    } else if (k == 3) {
                        System.out.println(i + "-" + j + "-E");
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
    }
    
}
