/**
 * 
 * @author schauer
 *
 * Klasse Auto mit 2 Instanzvariablen, 1 eigener Konstruktor, setter und Getter
 */
public class Auto {

	//Eigenschaften also die Instanzvariablen
	
	private String name;
	private int preis;
	
	//Konstruktor
	
	public Auto(String name, int preis){
		
		this.name = name;
		this.preis = preis;
		
	}
	
	// Eigene Methoden: 
	public void fahrenVonAnachB(String start, String ziel){
		
		// Methodenrumpf
		System.out.println("Das Auto faehrt von "+start+" nach "+ziel);
	}
	
	public void bremsen(){
		System.out.println(name+" bremst...");
	}

	
	// Setter und Getter für die Instanzvariablen:
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
	
}
