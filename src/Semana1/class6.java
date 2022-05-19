package Semana1;

import java.util.Scanner;

public class class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Por ejemplo si el usuario ingresa 22, 18 y 6 debe advertir al usuario que 6 es un número no permitido porque es mayor a 22 menos 18.

		int valor1, valor2, multiplo, resta;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("ingrese un numero");
			valor1 = input.nextInt();
		System.out.println("ingrese otro numero mayor al anterior");
			valor2 = input.nextInt();
		System.out.println("Ingrese el multiplo");
			multiplo = input.nextInt();
			
			resta = valor1 - valor2;
			
			if(multiplo > resta) {
		if (valor2 > valor1) {		
			
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
		}else {
		 System.out.println(multiplo+" no es un numero permitido");
	 
	}
  }
 }
}

