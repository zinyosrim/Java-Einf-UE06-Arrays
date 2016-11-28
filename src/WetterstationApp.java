
public class WetterstationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] wetterDatenArray = {23.2, 17.8, 20.0, 14.1, 15.4, 19.9, 18.0};
		Wetterstation myWetterstation = new Wetterstation(wetterDatenArray);
		
		System.out.println("Durchschnittstemp ist: "+myWetterstation.getDurchschnittsTemperatur());
		System.out.println("Maxtemp ist: "+myWetterstation.getMaxTemperatur());
		System.out.println("Tag mit der niedrigsten Temp ist: "+myWetterstation.getTagDerNiedrigstenTemperatur());
	}


}
