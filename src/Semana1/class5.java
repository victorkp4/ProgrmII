package Semana1;

import java.util.Scanner;

public class class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**IMPRIMO LOS NUMEROS ENTRE EL PRIMER Y SEGUNDO VALOR INGRESADO EXCEPTO EL MULTIPLO**");
		int valor1, valor2, multiplo;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("ingrese un numero");
			valor1 = input.nextInt();
		System.out.println("ingrese otro numero mayor al anterior");
			valor2 = input.nextInt();
		System.out.println("Ingrese el multiplo");
			multiplo = input.nextInt();
			
		if (valor2 > valor1) {
			System.out.println("los numeros enteros entre "+valor1+" y "+valor2+ " son.");
			
			for (int i = valor1; i <= valor2; i++) {
				if (i%multiplo==0) {
				}else {
					System.out.println(i);
				}
				
			}
		} else {
			for (int i = valor2; i <= valor1 ; i++) {
				if (i%multiplo==0) {
			}else {
				System.out.println(i);
			}
			}
		}
	}
}
