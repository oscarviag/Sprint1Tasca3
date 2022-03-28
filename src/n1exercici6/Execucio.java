package n1exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Execucio {
	
	static LinkedList<Integer> linkedlist = new LinkedList<>();
	static ListIterator<Integer> litr;
	
	public static void insertarMig(int valorInsertar) {
		int mig = (int) Math.ceil((linkedlist.size()+1)/2);
		litr=linkedlist.listIterator(mig);
		litr.add(valorInsertar);
	}

	public static void main(String[] args) {
		
		insertarMig(1);
		insertarMig(2);
		insertarMig(3);
		insertarMig(4);
		insertarMig(5);
		insertarMig(6);
		insertarMig(7);
		insertarMig(8);
		insertarMig(9);
		insertarMig(10);
						
		System.out.println(linkedlist);
		
	}
	
}
