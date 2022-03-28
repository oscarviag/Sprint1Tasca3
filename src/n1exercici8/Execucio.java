package n1exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class Execucio {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Object> linkedhashmap = new LinkedHashMap<String, Object>();
		LinkedHashMap<String, Object> linkedhashmapOrdenat = new LinkedHashMap<String, Object>();
		List<ParellsExtrets> llista = new ArrayList<ParellsExtrets>();
		
		linkedhashmap.put("Z", "Antonio");
		linkedhashmap.put("D", "David");
		linkedhashmap.put("B", "Begoña");
		linkedhashmap.put("E", "Esther");
		
		System.out.println("LinkedHashMap Original");
		for (Entry<String, Object> element : linkedhashmap.entrySet()) {
			
			System.out.println(element);
		}
						
		for (Entry<String, Object> element : linkedhashmap.entrySet()) {
						
			String key = element.getKey();
			Object value = element.getValue();			
			llista.add(new ParellsExtrets(key,value));			
		}
		
		System.out.println("\nArrayList Sense Ordenar");
		for (ParellsExtrets element:llista) {
			
			System.out.println(element.llistaKeys + " " + element.llistaValues);
		}
		
		Collections.sort(llista, new Comparador());
		
		System.out.println("\nArrayList Ordenat");
		for (ParellsExtrets element:llista) {
			
			System.out.println(element.llistaKeys + " " + element.llistaValues);
		}
		
		
		for (ParellsExtrets element:llista) {
			
			linkedhashmapOrdenat.put(element.llistaKeys, element.llistaValues);
		}
		
		System.out.println("\nLinkedHashMap Ordenat");
		
		for (Entry<String, Object> element : linkedhashmapOrdenat.entrySet()) {
			
			System.out.println(element);
		}

	}

}
