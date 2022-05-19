package BingoClase2;

import java.util.Random;

public class Bolillero {

	public static int dameBolilla(){
		int[] vector = new int[89];
		
		int min_val = 0;
		int max_val = 90;
		
		
		for(int i=0;i<8;i++) {
			Random rand = new Random();
			int aleatorio = min_val + rand.nextInt((max_val - min_val)+1);
			vector[i] = aleatorio;
			System.out.println(vector[i]);			
		}
		return aleatorio;	
	}
}
