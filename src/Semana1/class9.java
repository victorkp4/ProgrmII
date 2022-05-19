package Semana1;

import java.util.Scanner;

public class class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Este programa calcula las vocales de una frase");
		String var1;
		String var2;
		int x=0;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingrese una frase");
		var1 = input.nextLine();
		
		for(int i=0; i<var1.length(); i++) {
			var2 = var1.substring(i,(i+1));
			if((var2.equalsIgnoreCase("a"))||(var2.equalsIgnoreCase("e"))||(var2.equalsIgnoreCase("i"))||(var2.equalsIgnoreCase("o"))||(var2.equalsIgnoreCase("u"))) {
				x = x+1;
			}
		}
		System.out.println("La frase '"+var1+"' poseé "+x+" vocales ");
	}

}
