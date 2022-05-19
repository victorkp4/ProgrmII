package Semana1;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***TE MUESTRO LOS NUMEROS ENTRE LOS DOS VALORES QUE INGRESES, EXCEPTO LOS QUE SEAN MULTIPLOS DE 5***");
		int valor1, valor2;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("ingrese un numero");
			valor1 = input.nextInt();
		System.out.println("ingrese otro numero");
			valor2 = input.nextInt();
			
		if (valor2 > valor1) {
			System.out.println("los numeros enteros entre "+valor1+" y "+valor2+ "son.");
			
			for (int i = valor1; i <= valor2; i++) {
				if (i%5==0) {
				}else {
					System.out.println(i);
				}
				
			}
				}else {
					for (int i = valor2; i <= valor1 ; i++) {
						if (i%5==0) {
						}else {
							System.out.println(i);
			}
		}
	}
	}		
}
