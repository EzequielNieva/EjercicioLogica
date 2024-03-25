Algoritmo CurosJava
	Definir nombre,apellido Como Caracter;
	Definir num Como Entero;
	Definir metro, pulgada Como Real;
	//ejericio1
	Escribir "Ingrese nombre:";
	leer nombre;
	Escribir "Ingrese apellido";
	leer apellido;
	Escribir "Bienvenido al curso "+ nombre +" "+apellido;
	
	//ejercicio2
	Escribir "Ingrese un numero:";
	leer num;
	
	Si num  MOD 2==0 Entonces
		Escribir "El numero es par";
	SiNo
		Escribir "El numero es impar";
	Fin Si
	
	//ejercicio3
	
	Escribir "Ingrese la cantidad de metro para pasar a pulgadas:";
	Leer metro;
	pulgada = metro * 39.37;
	Escribir "La cantidad de metro ingresada equivale a ", pulgada, " pulgada";
FinAlgoritmo
