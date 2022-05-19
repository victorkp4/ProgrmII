package Semana1;

import java.util.Scanner;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***TE MUESTRO LOS NUMEROS ENTRE LOS DOS VALORES QUE INGRESES***");
		int valor1, valor2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese un numero");
			valor1 = teclado.nextInt();
		System.out.println("Ingrese otro numero MAYOR que el anterior");
			valor2 = teclado.nextInt();
					
		if(valor2 > valor1) {
			System.out.println("Los numeros enteros entre "+valor1+" y "+valor2+" son.");
			for (int i = valor1; i <= valor2 ; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("El segundo numero ingresado debe ser mayor que el primer");
		}
	}

}
