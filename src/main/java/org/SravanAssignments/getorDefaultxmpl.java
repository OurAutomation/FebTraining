package org.SravanAssignments;
import java.util.HashMap;
import java.util.Map;
public class getorDefaultxmpl {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("Values in the map: " + map.values());
        System.out.println("Value for key 'B': " + map.getOrDefault("B", 0));
        System.out.println("Value for key 'D': " + map.getOrDefault("D", 0));
    }
}
