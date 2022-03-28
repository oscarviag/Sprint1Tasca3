package n1exercici7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Execucio {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		ArrayList<MapAmbHashCode> llista = new ArrayList<MapAmbHashCode>();
		
		//Crear HashMap
		hashmap.put("Z", "Antonio");
		hashmap.put("D", "David");
		hashmap.put("B", "Begoña");
		hashmap.put("E", "Esther");
		
		System.out.println("Llista HashMap");
		
		for (Map.Entry<String, String> element : hashmap.entrySet()) {
			
			System.out.println(element + " " + element.hashCode());
		}
		
		
		//Crear ArrayList amb Hashcode per ordenar
		for (Entry<String, String> element : hashmap.entrySet()) {
			
			String key = element.getKey();
			String value = element.getValue();
			Integer hashcode = element.hashCode();
			llista.add(new MapAmbHashCode(key,value,hashcode));			
		}
		
		
		System.out.println("\nLlista ArrayList Ordenada per HashCode");
		
		Collections.sort(llista, new Comparador());
		
		for (MapAmbHashCode element:llista) {
			
			System.out.println(element.hashcode + " " + element.key + " " + element.value );
		}
		
		//Creem treemap per ordenar hashmap per key
		
		TreeMap<String, String> treemap = new TreeMap<String, String>(hashmap);
		
		// Creem LinkedHasMap a partir del TreeMap
		System.out.println("\nLlista LinkedHashMap ordenada per Key");
		
		LinkedHashMap<String, String> linkedhashmap = new LinkedHashMap<String, String>(treemap);
		
		for (Map.Entry<String, String> element : linkedhashmap.entrySet()) {
			
			System.out.println(element);
		}
		
		
		//Agafem només les claus ordenades
		ArrayList<String> clausOrdenades = new ArrayList<>();
		for (Entry<String, String> element : linkedhashmap.entrySet()) {
			
			String key = element.getKey();			
			clausOrdenades.add(key);			
		}
		
		HashSet<String> hashset = new HashSet<>();
		
		for (String element : clausOrdenades) {
			hashset.add(element);
		}
		
		System.out.println("\nLlista HashSet");
		for (String element : hashset) {
			System.out.println(element);
		}
		
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
		
		for (String element : clausOrdenades) {
			linkedhashset.add(element);
		}
		
		
		System.out.println("\nLlista LinkedHashSet");
		
		for (String element : linkedhashset) {
			System.out.println(element);
		}		
	}

}
