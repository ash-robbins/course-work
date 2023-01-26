package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//Declaring and initialzing a map
		Map<String, String> nameToZip = new HashMap<>();

		//Adding an item to a Map
		nameToZip.put("Neo", "19107");
		nameToZip.put("Morpheus", "19146");
		nameToZip.put("Trinity", "19125");

		//Retrieving an item from a Map
		System.out.println("Neo live in " + nameToZip.get("Neo"));
		System.out.println("Morpheus lives in " + nameToZip.get("Morpheus"));
		System.out.println("Trinity lives in " + nameToZip.get("Trinity"));

		//Retreiving just the keys from a Map
		System.out.println("Looping through map using keys...");

		Set<String> keys = nameToZip.keySet(); //returns a collection of all keys
		for(String name : keys){
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		// check to see if key already exist
		if(nameToZip.containsKey(("neo)")){
			System.out.println("Neo exist");

			nameToZip.put("Neo, 12345"); // if already exist then value is updated
			for (String key : keys) {
				System.out.println(key + "lives in " + nameToZip.get(key));
			}
			System.out.println();
			//Iterate through the key value pairs in the Map
			for (Map.Entry<String, String> nameZip : nameToZip.entrySet()){
				System.out.println(nameZip.getKey() + "lives in " + nameZip.getValue());
			}
		// remove an object from the mao
			nameToZip.remove("Neo");
			System.out.println("removed Neo");
			System.out.println();

	}

}
