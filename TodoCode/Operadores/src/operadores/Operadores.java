
package operadores;

public class Operadores {

  
    public static void main(String[] args) {
        
        int num1,num2,suma,resta,multiplicacion,division;
        boolean mayor,menor,mayigual,menorigual,distinto;
        
        num1=4;
        num2=2;
        
        suma= num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        
        mayor=num1<num2;
        menor=num1>num2;
        mayigual=num1<=num2;
        menorigual=num1>=num2;
        distinto=num1!=num2;
        
        System.out.println("suma = " + suma + "\n"+"resta = " + resta + "\n"+"multiplicacion = "+multiplicacion+"\n"+"division = "+division);
        System.out.println("mayor = " + mayor + "\n" + "menor = " + menor + "\n" + "mayor igual =" + mayigual + "\n" +"menor igual = "+menorigual+"\n"+"distinto = "+distinto);
    }
    
}
