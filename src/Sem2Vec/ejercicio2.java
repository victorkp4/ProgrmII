package Sem2Vec;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[5];
		
		System.out.println("Ingresa valores de tipo entero en el vector: ");
		for (int i=0;i<5;i++) {
			
		 System.out.println((i+1)+". Ingresa un valor: ");
		 numeros[i] = entrada.nextInt();{
	}
		}
		//esto es para imprimir los valores del vector
		System.out.println("***Los elementos del vector***");
		for (int i=0;i<5;i++) {
		System.out.println(numeros[i]);
	 }
	}
 }

