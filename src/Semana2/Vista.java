package Semana2;

import java.util.Scanner;


public class Vista {
	
	public static Persona entregarPersona() {
		  Scanner leer = new Scanner (System.in);
				
		 System.out.println("Ingrese su nombre: ");
	        String Nombre = leer.nextLine(); 
	        System.out.println("Ingrese su apellido: ");
	        String Apellido = leer.nextLine();
	      System.out.println("Ingrese el turno que le asignamos");
	      String Turno = leer.nextLine();
	         
	      Persona estaPersona = new Persona();
	        estaPersona.setNombre(Nombre);
	        estaPersona.setApellido(Apellido);
	        estaPersona.setTurno(Turno);
	        
	        
	        return estaPersona; 		
	}
	public static void mostrarPersona(Persona a) {
		System.out.println("Nombre: "+ a.getNombre());
		System.out.println("apellido: "+ a.getApellido());
		System.out.println("Turno: "+ a.getTurno());
	}

}
