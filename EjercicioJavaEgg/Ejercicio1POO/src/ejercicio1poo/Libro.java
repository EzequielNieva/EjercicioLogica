
package ejercicio1poo;


public class Libro {
    
    int isbn;
    String titulo;
    String autor;
    int numeroPagina;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    
    public void llenarLibro(int isbn, String titulo, String autor, int numeroPagina){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
           
    public void mostrarLibro(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPagina);
    }
}
