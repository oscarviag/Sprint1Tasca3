package n2exercici1;

import java.util.PriorityQueue;

public class Execucio {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> cua = new PriorityQueue<Integer>();
		
		for (int i=0;i<10;i++) {
						
			cua.add(new Numero().numero);
		}
		
		System.out.println("PriorityQueue creada");
		System.out.println(cua);
		
		System.out.println("\nPriorityQueue cada cop que treiem un element de la cua");
		for (int i=0;i<10;i++) {
			
			cua.poll();
			System.out.println(cua);
		}
		
		System.out.println("\nPriorityQueue un cop trets tots els elements");
		System.out.println(cua);
	}

}
