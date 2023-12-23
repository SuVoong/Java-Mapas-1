package practicaTreeSet2;

import java.util.Scanner;

public class Lector {
	public static String pedirNombre(Scanner sc) {
		System.out.println(
				 "Escribe el nombre: ");
		String nombre = sc.nextLine();
		return nombre;
	}
	
	public static Integer pedirEstatura(Scanner sc) {
		System.out.println("Escribe la estatura: ");
		int estatura = Integer.parseInt(sc.nextLine());
		return estatura;
	}
	
	public static Jugador crearJugador(Scanner sc) {
		String nombre = Lector.pedirNombre(sc);
		int estatura = Lector.pedirEstatura(sc);
		Jugador j = new Jugador(nombre, estatura);
		return j;
	}
}
