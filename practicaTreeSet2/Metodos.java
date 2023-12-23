package practicaTreeSet2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.TreeSet;

public class Metodos {
	static TreeSet<Jugador>trSt = new TreeSet<Jugador>();
	public static void introducirJugador(Jugador j) {
		Iterator<Jugador> itr = trSt.iterator();
			try {
				while (itr.hasNext()) {
				if(j.getNombre().equals(itr.next().getNombre())) {
					System.out.println("El jugador "+ j.getNombre() + " esta repetido");
				}
				}
				trSt.add(j);	
			}catch(ConcurrentModificationException e){
				System.out.println("Error: no se puede añadir este jugador porque tiene el mismo nombre que otro. " + e);
		}
				
	}
	public static void listaJugador() {
		Iterator<Jugador> itr = trSt.iterator();
		if(!trSt.isEmpty()) {
			while (itr.hasNext()) {
			Jugador j = itr.next();
			System.out.println("Nombre del jugador: "+j.getNombre() + " | Edad del jugador: "+j.getEstatura());
		}
		}
		else {
			System.out.println("No hay lista.");
		}
	}

	public static void eliminarPersona( Jugador j) {
		if (trSt.contains(j)) {
			trSt.remove(j);	
			System.out.println("Se ha eliminado " + j.getNombre());
		}
		else {
			System.out.println("No existe ese nombre.");
		}
	
	}
	public static void eliminarTodo() {
			trSt.removeAll(trSt);
		
		System.out.println("Esta eliminado todo.");
		
	}
}
