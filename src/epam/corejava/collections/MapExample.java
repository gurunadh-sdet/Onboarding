package epam.corejava.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("guru", "EPAM");
		map.put("Nalli", "AnZ");
		map.put("Mahesh", "BOA");
		
		System.out.println(map.containsKey("guru"));
		System.out.println(map.containsValue("BOA"));
		map.remove("guru");
		System.out.println(map.containsKey("guru"));
		System.out.println(map);
		
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("Hyderabad", 10);
		linkedHashMap.put("Chennai", 30);
		linkedHashMap.put("Mumbai", 5);
		linkedHashMap.put("Banglore", 25);
		System.out.println(linkedHashMap);// insertion order being maintained
		System.out.println(linkedHashMap.isEmpty());
		System.out.println(linkedHashMap.get("Chennai"));
		linkedHashMap.clear();
		System.out.println(linkedHashMap);// insertion order being maintained
		System.out.println(linkedHashMap.isEmpty());
		
		
		
		
	}

}
