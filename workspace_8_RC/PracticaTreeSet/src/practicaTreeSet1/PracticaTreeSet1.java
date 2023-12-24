package practicaTreeSet1;


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class PracticaTreeSet1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		TreeSet<Integer> num = new TreeSet<Integer>();
		System.out.println("Introduce el número");
		String numero[] = sc.nextLine().split(" ");
		
		for(String strNumero: numero ) {
			try {
				if(!num.add(Integer.parseInt(strNumero))) {
					System.out.println("El número "+ strNumero + " esta repetido");
				}
			}catch(NumberFormatException e){
//				System.out.println("Error " + e);
			}
		}
		System.out.println("Los números ordenados ascendientemente y sin repetidos son: ");
		Iterator<Integer> iterator = num.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
