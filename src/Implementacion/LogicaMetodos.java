package Implementacion;


import Interface.Metodos;
import Model.Informatica;
import java.util.HashMap;
import java.util.Map;


public class LogicaMetodos implements Metodos{

	
	// HashMap para almacenar objetos Informatica
    private HashMap<Long, Informatica> profesionistas = new HashMap<>();

    @Override
    public void guardar(Informatica informatica) {
        profesionistas.put(informatica.getCeddula(), informatica);
        System.out.println("Guardado: " + informatica);
    }

    @Override
    public void mostrar() {
        System.out.println("Listado de profesionistas en Informática:");
        if (profesionistas.isEmpty()) {
            System.out.println("No hay registros en el sistema.");
        } else {
            for (Map.Entry<Long, Informatica> entry : profesionistas.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    @Override
    public Informatica buscar(long cedula) {
        Informatica encontrado = profesionistas.get(cedula);
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró la cédula " + cedula);
        }
        return encontrado;
    }

    @Override
    public void editar(Informatica informatica) {
        long cedula = informatica.getCeddula();
        if (profesionistas.containsKey(cedula)) {
            profesionistas.put(cedula, informatica);
            System.out.println("Actualizado: " + informatica);
        } else {
            System.out.println("No se encontró la cédula " + cedula);
        }
    }

    @Override
    public void eliminar(long cedula) {
        if (profesionistas.containsKey(cedula)) {
            profesionistas.remove(cedula);
            System.out.println("Eliminado con cédula " + cedula);
        } else {
            System.out.println("No se encontró la cédula " + cedula);
        }
    }
	
}
