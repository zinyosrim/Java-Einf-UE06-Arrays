
public class Schachbrett {

	// instanzvariable
	private char[][] aufstellung;
	
	//konstruktor
	public Schachbrett(char[][] aufstellung){
		this.aufstellung = aufstellung;
	}

	

	//methoden
	
	//setter
	public void setAufstellung(char[][] aufstellung) {
		this.aufstellung = aufstellung;
	}
	
	//getter
	public char[][] getAufstellung() {
		return aufstellung;
	}
 
	//Startaufstellung
	public void startAufstellung(){
		//setze felder ohne figuren auf 0
		for(int r=2;r<6;r++){
			for(int s=0;s<8;s++){
				this.aufstellung[r][s]='0';
			}
		}
		//setze felder ohne figuren auf 0
		for(int s=0;s<8;s++){
				this.aufstellung[1][s]='B';
				this.aufstellung[6][s]='B';				
		}
		
		//turm
		this.aufstellung[0][0]='T';
		this.aufstellung[0][7]='T';
		this.aufstellung[7][0]='T';
		this.aufstellung[7][7]='T';
		//springer
		this.aufstellung[0][1]='S';
		this.aufstellung[0][6]='S';
		this.aufstellung[7][1]='S';
		this.aufstellung[7][6]='S';
		//läufer
		this.aufstellung[0][2]='L';
		this.aufstellung[0][5]='L';
		this.aufstellung[7][2]='L';
		this.aufstellung[7][5]='L';
		//könig
		this.aufstellung[0][4]='K';	
		this.aufstellung[7][4]='K';
		//dame
		this.aufstellung[0][3]='D';	
		this.aufstellung[7][3]='D';	
		
		
		
	}

	public void printSchachbrett() {
		//initialisiere leeres Brett
		for(int reihe=0;reihe<8;reihe++){
			for(int spalte=0;spalte<8;spalte++){
				System.out.print(this.aufstellung[reihe][spalte]+" ");
			}
			System.out.println();
			System.out.println();
		}
	}
	

	
}
