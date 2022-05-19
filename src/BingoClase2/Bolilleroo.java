package BingoClase2;

public class Bolilleroo {

	public static void main(String[] args) {
		int vector[] = new int[10];
		
		for (int i=0;i<10;i++) {
			vector[i] = (int) (Math.random()*90+0);
			System.out.println("bolilla "+i+"--->" +vector[i]);
		}
	}

}
