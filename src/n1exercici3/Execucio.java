package n1exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Execucio {

	public static void main(String[] args) {
		
		ArrayList <String> arraylist = new ArrayList<>();
		LinkedList <String> linkedlist = new LinkedList<>();
		HashSet <String> hashset = new HashSet<>();
		LinkedHashSet <String> linkedhashset = new LinkedHashSet<>();
		TreeSet <String> treeset = new TreeSet<>();
		
		String personatge;
		
		
		for (int i=0;i<Generadora.personatges.length+1;i++) {
			
			personatge = Generadora.seguentPersonatge();// Així omplirem a cada Contenidor el mateix valor per veure com actuen
			
			arraylist.add(personatge);
			linkedlist.add(personatge);
			hashset.add(personatge);
			linkedhashset.add(personatge);
			treeset.add(personatge);
			
			/* arraylist.add(Generadora.seguentPersonatge());
			linkedlist.add(Generadora.seguentPersonatge());
			hashset.add(Generadora.seguentPersonatge());
			linkedhashset.add(Generadora.seguentPersonatge());
			treeset.add(Generadora.seguentPersonatge()); */		
		}
		
		System.out.println("Llista d'elements de l'ArrayList");
		System.out.println(arraylist);
		
		/*for (String element : arraylist) {
            System.out.println(element);
        }*/
		
		System.out.println("\nLlista d'elements de la LinkedList");
		for (String element : linkedlist) {
            System.out.println(element);
        }
		
		System.out.println("\nLlista d'elements del HashSet");
		for (String element : hashset) {
            System.out.println(element);
        }
		
		System.out.println("\nLlista d'elements del LinkedHashSet");
		for (String element : linkedhashset) {
            System.out.println(element);
        }
		
		System.out.println("\nLlista d'elements del TreeSet");
		for (String element : treeset) {
            System.out.println(element);
        }		

	}

}
