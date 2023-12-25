package practicaHashSet1;

import java.util.HashSet;
import java.util.Iterator;


public class Metodos {
	public static void introducirPalabra(HashSet<String> listPalabra, String palabra) {
		Iterator<String> itr = listPalabra.iterator();
		String p = itr.next();
		try {
			while (itr.hasNext()) {
			if(palabra.equals(p)) {
				System.out.println("La palabra "+ p+ " esta repetida");
			}
			}
			listPalabra.add(p);	
		}catch(Exception e){
			System.out.println("Error: no se puede añadir esta palabra porque esta repetida. " + e);
	}
		listPalabra.add(palabra);
		
	}

	public static void listaPalabra(HashSet<String> listPalabra) {
		Iterator<String> itr = listPalabra.iterator();
		
		if(!listPalabra.isEmpty()) {
			while (itr.hasNext()) {
				String palabra = itr.next();
				System.out.println("Palabra: " + palabra);
			}
		}
		else {
			System.out.println("No hay lista.");
		}
		
	}

	public static void eleminarPalabra(HashSet<String> listPalabra, String palabra) {
		Iterator<String> itr = listPalabra.iterator();
		
		if (listPalabra.contains(palabra)) {
			listPalabra.remove(palabra);	
			System.out.println("Se ha eliminado " + palabra);
		}
		else {
			System.out.println("No existe ese nombre.");
		}
		
	}

	public static void borrarTodo(HashSet<String> listPalabra) {
		listPalabra.removeAll(listPalabra);
		System.out.println("Esta eliminado todo.");
	}

	public static void mostrarPalabra(HashSet<String> listPalabra, String palabra) {
		Iterator<String> itr = listPalabra.iterator();
		while (itr.hasNext()) {
			String pr = itr.next();
			System.out.println("Palabra: " +pr);
		}
	}

	public static String buscarPalabra(HashSet<String> listPalabra, String palabra) {
		Iterator<String> itr = listPalabra.iterator();
		while (itr.hasNext()) {
			String pr = itr.next();
			if (pr.equals(palabra)) {
			return ("La palabra "+ pr +" se encuentra la ");
			}
		}
		return "No exite la palabra que estas ";
	}

	

}
