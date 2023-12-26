package practicaHashSet2;

import java.util.LinkedList;
import java.util.Scanner;


public class PrecticaHashSet2 {
	public class PracticaTreeSet1 {
		public static void main (String [] args) {
			Scanner sc = new Scanner (System.in);
			final int fnl = 7; 
			int menu;
			LinkedList<Empleado> listEm = new LinkedList<Empleado>();
			
			do {
				System.out.println("Opciones\r\n"
						+ "1.-Introducir palabra\r\n"
						+ "2.-Listar palabras\r\n"
						+ "3.-Eliminar palabra\r\n"
						+ "4.-Borrar todas\r\n"
						+ "5.-Mostrar tamaño\r\n"
						+ "6.-Buscar palabra\r\n"
						+ "7.-Salir\r\n"
						+ "\nDime que opción eliges: \n");
				menu = Integer.parseInt(sc.nextLine());
				
				switch(menu) {
				
				case 2:
					Metodos.listaEmpleado(listEm, sc);
					break;
				}
				
			}while(fnl != menu);
			System.out.println("Has salido.");
		}
		public static void crearPersona(LinkedList<String> listPalabra) {
			listPalabra.add("hola");
		}
	}
}
