package n1exercici5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Execucio {

	public static void main(String[] args) {
		
		List<Integer> llista1 = new ArrayList<>();
		List<Integer> llista2 = new ArrayList<>();
		ListIterator<Integer> valor;
		
		llista1.add(2);
		llista1.add(5);
		llista1.add(8);
		llista1.add(210);
		llista1.add(67);
		llista1.add(38);
				
		llista2.add(9);
		llista2.add(15);
		llista2.add(48);
		llista2.add(10);
		llista2.add(78);
		llista2.add(93);
				
		valor = llista1.listIterator(llista1.size());
		
		while(valor.hasPrevious()) {
			
			llista2.add(valor.previous());
		}
		
		for (int element : llista2) {
			
			System.out.println(element);
		}
		
	}

}
