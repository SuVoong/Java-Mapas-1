package practicaTreeSet2;

import java.util.Scanner;

public class PracticaTreeSet2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
 		menuTreeSet(sc);
		System.out.println("Fin del programa!");
		
		
		sc.close();
		
	}
	public static void menuTreeSet(Scanner sc) {
		final int num = 5;
		int menu = 0;
		
		do{
			System.out.println("Opciones:\r\n"
					+ "1.-Introducir jugador\r\n"
					+ "2.-Listar jugadores\r\n"
					+ "3.-Eliminar jugador\r\n"
					+ "4.-Borrar todos\r\n"
					+ "5.-Salir"
					+ "\nQue opcion eliges.");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("Dime los datos para introducir el jugador.");
				Metodos.introducirJugador(Lector.crearJugador(sc));
				break;
			case 2:
				Metodos.listaJugador();
				break;
			case 3:
				System.out.println("Dime los datos para eliminar el jugador.");
				Metodos.eliminarPersona(Lector.crearJugador(sc));
				break;
			case 4:
				Metodos.eliminarTodo();
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default: System.out.println("No extiste esta opción");
			}
		}while (menu != num);
	}
}
