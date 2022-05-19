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
		System.out.println("Por favor ingrese la contraseña");
		pass = input.next();
		
		String usuario = "enzo";
		String contraseña = "4321";
		
		if(user.equals(usuario)) {
			if(pass.equals(contraseña)) {
				System.out.println("***Bienvenido al sistema***");
				
				System.out.println("Ingrese la nueva contraseña");
				contraseña = input.next();
				System.out.println("La contraseña se ha cambiado correctamente y es: "+contraseña);
			}else {
				System.out.println("La contraseña ingresada no es Valida");
			}
		}else {
			System.out.println("El usuario ingresado no es Valido");
		}

	}

}
