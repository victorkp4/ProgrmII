package Semana1;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		System.out.println("***Suma de Dos Numeros***");
		
		int n1=0, n2=0, sum;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Ingrese un Numero  ");
		n1 = input.nextInt();
		System.out.println("Ingrese otro Numero  ");
		n2 = input.nextInt();
		
		sum = n1+n2;
		System.out.println("La suma de "+n1+" + "+n2+" es: "+sum);

	}

}
