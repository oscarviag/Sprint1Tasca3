package n1exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Execucio {
	
	public static void recorrer(Collection<String> colleccio) {
		
		Iterator<String> iterador = colleccio.iterator();
		
		while(iterador.hasNext()){
			
			System.out.println(iterador.next().toString());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ArrayList <String> arraylist = new ArrayList<>();
		LinkedList <String> linkedlist = new LinkedList<>();
		HashSet <String> hashset = new HashSet<>();
		LinkedHashSet <String> linkedhashset = new LinkedHashSet<>();
		TreeSet <String> treeset = new TreeSet<>();
		
		for (int i=1; i<=10; i++){
			arraylist.add("Element "+i);
			linkedlist.add("Element "+i);
			hashset.add("Element "+i);
			linkedhashset.add("Element "+i);
			treeset.add("Element "+i);						
		}
		
		System.out.println("Llistat d'ArrayList");
		recorrer(arraylist);
		
		System.out.println("Llistat de LinkedList");
		recorrer(linkedlist);
		
		System.out.println("Llistat de HashSet");
		recorrer(hashset);
		
		System.out.println("Llistat de LinkedHashSet");
		recorrer(linkedhashset);
		
		System.out.println("Llistat de TreeSet");
		recorrer(treeset);

	}
	
	

}
