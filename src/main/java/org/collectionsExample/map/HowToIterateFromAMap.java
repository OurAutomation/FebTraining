package org.collectionsExample.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HowToIterateFromAMap {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
//        Map<String, String> personalData = new HashMap<>();
        Map<String, String> personalData = new LinkedHashMap<>();
        personalData.put("firstname", "Bharghav");
        personalData.put("lastname", "Sravan");
        personalData.put("location", "hyderabad");
        personalData.put("location", "bangalore");
        personalData.putIfAbsent("location", "Mumbai");
        //This is using key set and for each loop
        /*Set<String> keySet = personalData.keySet();
        for (String key : keySet) {
            System.out.println("Key :: " + key + ", Value :: " + personalData.get(key));
        }*/
        //This is using entry set
       /* Set<Map.Entry<String, String>> entries = personalData.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Key :: " + entry.getKey() + ", Value :: " + entry.getValue());
        }*/
        //Using lambda expression
        personalData.entrySet().stream().forEach(e -> System.out.println("Key :: " + e.getKey() + ", Value :: " + e.getValue()));
        personalData.forEach((e, v) -> {
            System.out.println(e + " :: " + v);
        });
    }
}
