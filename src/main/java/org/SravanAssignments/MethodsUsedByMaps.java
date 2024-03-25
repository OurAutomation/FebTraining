package org.SravanAssignments;
import java.util.*;
public class MethodsUsedByMaps {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();
        // put(K key, V value)
        map.put("Rohitha", 23);
        map.put("Dad", 52);
        map.put("Ma", 46);
        map.put("Enemy",32);
        // Printing the map
        System.out.println("Initial Map: " + map);
        // get(Object key)
        System.out.println("Age of Me: " + map.get("Rohitha"));
        // remove(Object key)
        map.remove("Enemy");
        System.out.println("Map after removing Enemy: " + map);
        // containsKey(Object key)
        System.out.println("Is Thanu present in the map? " + map.containsKey("Thanu"));
        // containsValue(Object value)
        System.out.println("Is age 35 present in the map? " + map.containsValue(35));
        // keySet()
        Set<String> keySet = map.keySet();
        System.out.println("Keys in the map: " + keySet);
        // values()
        Collection<Integer> values = map.values();
        System.out.println("Values in the map: " + values);
        // entrySet()
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Entries in the map: " + entrySet);
    }
}
/*put(K key, V value): Associates the specified value with the specified key in the map. If the map previously contained a mapping for the key, the old value is replaced.

get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

remove(Object key): Removes the mapping for the specified key from the map if present.

containsKey(Object key): Returns true if this map contains a mapping for the specified key.

containsValue(Object value): Returns true if this map maps one or more keys to the specified value.

keySet(): Returns a Set view of the keys contained in the map.

values(): Returns a Collection view of the values contained in the map.

entrySet(): Returns a Set view of the mappings contained in this map.
*/