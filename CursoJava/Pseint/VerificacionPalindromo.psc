Algoritmo VerificacionPalindromo
	
	Definir palabra,palabraInvertida Como Caracter;
	Definir n Como Entero;
	
	Escribir "Ingrese una palabra";
	leer palabra;
	
	palabra=Minusculas(palabra);
	n=Longitud(palabra);
	
	palabraInvertida="";
	
	Mientras n>=0 Hacer
		palabraInvertida=palabraInvertida+SubCadena(palabra,n,n);
		n=n-1;
	Fin Mientras
	
	si palabra==palabraInvertida Entonces
		Escribir "La palabra ingresada es un palíndromo.";
	Sino
        Escribir "La palabra ingresada no es un palíndromo.";
    FinSi

	
FinAlgoritmo
