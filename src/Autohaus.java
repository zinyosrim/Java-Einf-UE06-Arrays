/**
 * 
 * @author schauer
 * 
 * Klasse AUtohaus: Enth�lt die Main-Methode als Einstiegspunkt ins Programm
 *
 */
public class Autohaus {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Willkommen im Autohaus!");
		System.out.println();
		
		// Objekte der Klasse Auto anlegen und mit den entsprechenden Werten f�r die Eigenschaften belegen:	
		Auto fiatPunto = new Auto("Fiat Punto", 9000);	
		Auto mercedes = new Auto("Mercedes",30000);
		Auto lambo = new Auto("Lamborghini",130000);
		Auto alfaSpider = new Auto("Alfa Spider",16000);
		
		//Speichern Sie daher zunächst alle Ihre erzeugten Autoobjekte in ein Array
		Auto[] meineAutos = {fiatPunto, mercedes, lambo, alfaSpider};
		
		//Lassen Sie sich nun die Preise all Ihrer erzeugten Autos anzeigen!
		for (Auto meinAuto : meineAutos){
			System.out.println(meinAuto.getName()+" hat einen Preis von "+meinAuto.getPreis());
		}
		System.out.println();

		//Führen Sie anschließend eine Preiserhöhung von 1000 Euro für alle Ihre Autos durch.
		int preisErhoehung = 1000;
		
		System.out.println("jetzt gibt es neue Preise. Die werden erhöht um: "+preisErhoehung);
		System.out.println();
		
		for (Auto meinAuto : meineAutos){
			meinAuto.setPreis(meinAuto.getPreis()+1000);
		}
		//Überprüfen Sie, ob die Preiserhöhung funktioniert hat, 
		//indem Sie sich wieder die aktuellen Preise all Ihrer Autos anzeigen lassen.
		for(int a=0;a<meineAutos.length;a++){
			System.out.println("mein Auto "+meineAutos[a].getName()+" kostet jetzt "+meineAutos[a].getPreis());
		}
	}

}
