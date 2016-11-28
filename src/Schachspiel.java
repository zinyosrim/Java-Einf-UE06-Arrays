
public class Schachspiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] nullBelegung = new char[8][8];
		
		Schachbrett mySchachspiel = new Schachbrett(nullBelegung);
		//mySchachspiel.setAufstellung(nullBelegung);
		
		mySchachspiel.startAufstellung();
		mySchachspiel.printSchachbrett();
	}

}
