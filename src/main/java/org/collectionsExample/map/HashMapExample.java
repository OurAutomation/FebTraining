package org.collectionsExample.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Sample data representing first and second rows
        String[] keys = {"Name", "Age", "Gender"};
        String[] values = {"John", "30", "Male"};

        // Create a HashMap to store the data
        HashMap<String, String> map = new HashMap<>();

        // Iterate through the keys and values arrays and populate the HashMap
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Print the HashMap
        System.out.println("HashMap: " + map);
    }
}
