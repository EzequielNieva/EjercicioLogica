/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
package ejercicio1poo;

import java.util.Scanner;


public class Ejercicio1POO {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro libro = new Libro();
        
        System.out.println("Ingrese el isbn del libro: ");
        int isbn = leer.nextInt();
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de pagina del libro: ");
        int cantidadPagina = leer.nextInt();
        
        libro.llenarLibro(isbn, titulo, autor, cantidadPagina);
        libro.mostrarLibro();
        
    }
    
}
