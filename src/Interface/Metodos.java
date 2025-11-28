package Interface;

import Model.Informatica;

public interface Metodos {
	
	public void guardar(Informatica informatica);
	
	public void mostrar();
	
	public Informatica buscar(long cedula);
	
	public void editar(Informatica informatica);
	
	public void eliminar(long cedula);

}
