package Semana1;

import java.util.Scanner;

public class class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		String pass;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Por favor ingrese el usuario");
		user = input.next();
		System.out.println("Por favor ingrese la contrase�a");
		pass = input.next();
		
		String usuario = "enzo";
		String contrase�a = "4321";
		
		if(user.equals(usuario)) {
			if(pass.equals(contrase�a)) {
				System.out.println("***Bienvenido al sistema***");
				
				System.out.println("Ingrese la nueva contrase�a");
				contrase�a = input.next();
				System.out.println("La contrase�a se ha cambiado correctamente y es: "+contrase�a);
			}else {
				System.out.println("La contrase�a ingresada no es Valida");
			}
		}else {
			System.out.println("El usuario ingresado no es Valido");
		}

	}

}
