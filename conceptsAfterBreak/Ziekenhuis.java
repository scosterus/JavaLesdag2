package conceptsAfterBreak;


public class Ziekenhuis {
	
	public static void main(String[] args) {
		Patient kees = new Patient();
		Dokter johan = new Dokter();
		johan.doktersnaam = "Johan";
		johan.opereren(kees);
	}

}

class Patient{
	boolean ziek = true;
	String voornaam = "Kees";
}

class Dokter{
	String doktersnaam;
	void opereren(Patient patient) {
		System.out.println("Ik ben dokter: " + doktersnaam);
		if(patient.ziek) {
			System.out.println(patient.voornaam + ",jou ga ik opereren");
			patient.ziek = false;
			System.out.println(patient.voornaam + " is weer beter!");
			
		}
		else {
			System.out.println("Hey jij bent helemaal niet ziek");
		}
	}
}