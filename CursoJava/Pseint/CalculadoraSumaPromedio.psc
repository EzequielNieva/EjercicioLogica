Algoritmo CalculadoraSumaPromedio
	
	Definir cantidadNumeros,num,suma,promedio como Real;
	
	definir i Como Entero;
	
	suma =0;
	Escribir "Ingrese la cantidad de notas";
	leer cantidadNumeros;
	
	Para i<-1 Hasta cantidadNumeros Con Paso 1 Hacer
		Escribir "Ingrese el n�mero ", i, ":";
        Leer num;
        suma = suma + num;
	Fin Para
	
	promedio = suma / cantidadNumeros;
    Escribir "La suma de los n�meros ingresados es: ", suma;
    Escribir "El promedio de los n�meros ingresados es: ", promedio;
	
FinAlgoritmo




