Algoritmo NumeroPrimo
	
	Definir num,contador,divisor Como Entero;
	
	Escribir "Ingrese el numero";
	Leer num;
	
	contador=0;
	
	Para divisor<-1 Hasta num Con Paso 1 Hacer
		si num % divisor== 0 Entonces
			contador=contador+1;
		FinSi
	Fin Para
	
	si contador==2 Entonces
		Escribir "El numero ", num, " es primo";
	SiNo
		Escribir "El numero ", num, " no es primo";
	FinSi	
	
FinAlgoritmo


