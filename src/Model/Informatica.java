package Model;


//extend --- herencia
// Vamos a heredar de todo lo que contenga la clase abstracta


public class Informatica extends Profesionistas{
	


	private String pc;
	private String lengProgag;
	
	
	public Informatica(String profesionista, long ceddula, String pc, String lengProgag) {
		super(profesionista, ceddula);
		this.pc = pc;
		this.lengProgag = lengProgag;
	}

	
	//toString
	@Override
	public String toString() {
		return "Informatica [getPc()=" + getPc() + ", getLengProgag()=" + getLengProgag() + ", pc=" + pc
				+ ", lengProgag=" + lengProgag + "\n]";
	}
	
	
	//Encapsulaminto
	
	public String getPc() {
		return pc;
	}



	public void setPc(String pc) {
		this.pc = pc;
	}



	public String getLengProgag() {
		return lengProgag;
	}



	public void setLengProgag(String lengProgag) {
		this.lengProgag = lengProgag;
	}


	
}
