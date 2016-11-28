
public class Wetterstation {
	
	//instanzvariablen
	private double[] temperaturen;
	
	//konstruktoren
	public Wetterstation(double[] temperaturen){
		this.temperaturen=temperaturen;
	};
	
	//methoden
	
	public double getDurchschnittsTemperatur(){
		double summe = 1;
		for (double temp : this.temperaturen){
			summe = summe+temp;
		}
		return summe/this.temperaturen.length;
	}
	
	public double getMaxTemperatur(){
		double max = 0;
		for (double temp : this.temperaturen){
			if (temp > max){
				max = temp;
			}
		}
		return max;
	}
	
	public int getTagDerNiedrigstenTemperatur(){
		int niedTempTag = 0;
		double minTemp = this.temperaturen[0];
		for (int i=0; i<this.temperaturen.length; i++){
			if (this.temperaturen[i] < minTemp){
				niedTempTag = i;
				minTemp = this.temperaturen[i];
			}
		}
		return niedTempTag;
	}
	
}
