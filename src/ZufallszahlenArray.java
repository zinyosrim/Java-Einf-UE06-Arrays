
import java.util.Random;
//import java.util.Scanner;

public class ZufallszahlenArray {

	private static int[] initArrayOfRandom(int anzahlZufallszahlen){
		
		int[] 	arrayOfRandom 	        = new int[anzahlZufallszahlen];
		Random 	rand 			        = new Random();

		int i = 0;
		while (i < anzahlZufallszahlen){
			arrayOfRandom[i] = rand.nextInt(10*anzahlZufallszahlen);
			i++;
		}
		return arrayOfRandom;

	};	
	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		//Scanner scan 			= new Scanner(System.in);
		int arrayLaenge			= 10;			
		int[] 	arrayOfRandom 	= initArrayOfRandom(arrayLaenge);
		int	kleinsteZufallszahl = Integer.MAX_VALUE;
		
		System.out.print("Die "+arrayLaenge+" Zufallszahlen sind: ");
		for(int zufallszahl : arrayOfRandom){
			System.out.print(zufallszahl+" ");
			if (zufallszahl<kleinsteZufallszahl){
				kleinsteZufallszahl = zufallszahl;
			}
		}
		System.out.println();	
		System.out.println("Die kleinste Zahl im Array ist: "+kleinsteZufallszahl);

	}

}
