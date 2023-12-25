package practicaHashSet1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class PrecticaHashSet1 {
	public class PracticaTreeSet1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HashSet<String> listPalabra = new HashSet<String>();
			crearPersona(listPalabra);
			
			menu(listPalabra, sc);
			System.out.println("Has salido.");
		}

		public static void crearPersona(HashSet<String> listPalabra) {
			listPalabra.add("hola");
		}
	}

	public static void menu(HashSet<String> listPalabra, Scanner sc) {
		final int fnl = 7;
		int menu;
		do {
			System.out.println("Opciones\r\n" + "1.-Introducir palabra\r\n" + "2.-Listar palabras\r\n"
					+ "3.-Eliminar palabra\r\n" + "4.-Borrar todas\r\n" + "5.-Mostrar tamaño\r\n"
					+ "6.-Buscar palabra\r\n" + "7.-Salir\r\n" + "\nDime que opción eliges: \n");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("Introducir una palabra: ");
				String palabra = sc.nextLine();
				Metodos.introducirPalabra(listPalabra, palabra);
				break;
			case 2:
				Metodos.listaPalabra(listPalabra);
				break;
			case 3:
				System.out.println("Eliminar una palabra");
				System.out.println("Dime la palabra: ");
				palabra = sc.nextLine();
				Metodos.eleminarPalabra(listPalabra, palabra);
				break;
			case 4:
				Metodos.borrarTodo(listPalabra);
				break;
			case 5:
				System.out.println("Mostrar una palabra");
				System.out.println("Dime la palabra: ");
				palabra = sc.nextLine();
				Metodos.mostrarPalabra(listPalabra, palabra);
				break;
			case 6:
				System.out.println("Introducir una palabra: ");
				palabra = sc.nextLine();
				Metodos.buscarPalabra(listPalabra, palabra);
			case 7:
				System.out.println("Saliento...");
				break;
			default:
				System.out.println("No existe esa opción.");
			}

		} while (fnl != menu);
	}
}
