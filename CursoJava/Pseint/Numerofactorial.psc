Algoritmo Numerofactorial
	
	Definir num,factorial,contador Como Entero;
	
	Escribir "Ingrese un numero entero no negativo";
	leer num;
	
	factorial=1;
	
    Para contador=1 Hasta num Hacer
		factorial=factorial*contador;
	FinPara
	
	Escribir "El factorial de ", num , " es: ",factorial ; 
FinAlgoritmo
