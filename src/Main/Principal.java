package Main;

import java.util.Scanner;
import Implementacion.LogicaMetodos;
import Model.Informatica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
        LogicaMetodos logica = new LogicaMetodos();
        int opcion = 0;
        
        do {
            System.out.println("\n=== SISTEMA DE PROFESIONISTAS ===");
            System.out.println("1--- Alta profesionista");
            System.out.println("2--- Buscar profesionista por cédula");
            System.out.println("3--- Editar profesionista");
            System.out.println("4--- Eliminar profesionista");
            System.out.println("5--- Mostrar todos los profesionistas");
            System.out.println("6--- Salir");
            System.out.println("Hola mundo");

            try {
                opcion = lectura.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ser un número.");
                lectura.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingrese nombre:");
                        lectura.nextLine();
                        String nombre = lectura.nextLine();
                        System.out.println("Ingrese cédula:");
                        long cedula = lectura.nextLong();
                        lectura.nextLine();
                        System.out.println("Ingrese PC:");
                        String pc = lectura.nextLine();
                        System.out.println("Ingrese lenguaje de programación:");
                        String lenguaje = lectura.nextLine();

                        Informatica nuevo = new Informatica(nombre, cedula, pc, lenguaje);
                        logica.guardar(nuevo);
                    } catch (Exception e) {
                        System.out.println("Error al registrar profesionista.");
                        lectura.nextLine();
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Ingrese cédula:");
                        long consulta = lectura.nextLong();
                        Informatica encontrado = logica.buscar(consulta);
                        if (encontrado != null) {
                            System.out.println("Resultado: " + encontrado);
                        } else {
                            System.out.println("Profesionista no encontrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al buscar profesionista.");
                        lectura.nextLine();
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Ingrese cédula a editar:");
                        long cedulaEdit = lectura.nextLong();
                        lectura.nextLine();
                        System.out.println("Ingrese nuevo nombre:");
                        String nuevoNombre = lectura.nextLine();
                        System.out.println("Ingrese nueva PC:");
                        String nuevaPc = lectura.nextLine();
                        System.out.println("Ingrese nuevo lenguaje:");
                        String nuevoLenguaje = lectura.nextLine();

                        Informatica editado = new Informatica(nuevoNombre, cedulaEdit, nuevaPc, nuevoLenguaje);
                        logica.editar(editado);
                    } catch (Exception e) {
                        System.out.println("Error al editar profesionista.");
                        lectura.nextLine();
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Ingrese cédula a eliminar:");
                        long cedulaDel = lectura.nextLong();
                        logica.eliminar(cedulaDel);
                    } catch (Exception e) {
                        System.out.println("Error al eliminar profesionista.");
                        lectura.nextLine();
                    }
                    break;

                case 5:
                    try {
                        System.out.println("--- Lista de profesionistas ---");
                        logica.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error al mostrar profesionistas.");
                        lectura.nextLine();
                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar el sistema de profesionistas.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion < 6);

    }
}
		

	

