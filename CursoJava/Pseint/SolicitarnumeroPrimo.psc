Algoritmo numeroPrimo
	Definir num, divisor, contador, numeroActual Como Entero;
    Definir esPrimo Como Logico;
	
    Escribir "Ingrese un número:";
    Leer num;
	
    Escribir "Números primos hasta ", num, ":";
    Para numeroActual = 2 Hasta num Con Paso 1 Hacer
        esPrimo = Verdadero;
        divisor = 2;
        Mientras divisor < numeroActual Y esPrimo Hacer
            Si numeroActual MOD divisor = 0 Entonces
                esPrimo = Falso;
            FinSi
            divisor = divisor + 1;
        FinMientras
        Si esPrimo Entonces
            Escribir numeroActual;
        FinSi
    Fin Para
FinAlgoritmo
