package Model;




// abstract class -- No se puede instanciar solamente heredar
//Super clase
public abstract class Profesionistas {
	

	private String Profesionista;
	private long Ceddula;
	
	
	// constructor
	public Profesionistas(String profesionista, long ceddula) {
		Profesionista = profesionista;
		Ceddula = ceddula;
	}
	

	public String getProfesionista() {
		return Profesionista;
	}


	public void setProfesionista(String profesionista) {
		Profesionista = profesionista;
	}


	public long getCeddula() {
		return Ceddula;
	}


	public void setCeddula(long ceddula) {
		Ceddula = ceddula;
	}

	
}
