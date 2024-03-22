package org.SravanAssignments;
    import java.util.HashMap;
import java.util.Map;

    public class PutAllandRemoveAll{
        public static void main(String[] args) {
            Map<String, Integer> map1 = new HashMap<>();
            map1.put("A", 1);
            map1.put("B", 2);
            map1.put("C", 3);

            Map<String, Integer> map2 = new HashMap<>();
            map2.put("B", 2);
            map2.put("C", 3);
            map2.put("D", 4);

            // Demonstrate putAll()
            Map<String, Integer> map3 = new HashMap<>(map1);
            map3.putAll(map2);
            System.out.println("After putAll(): " + map3);

            // Demonstrate removeAll()
            Map<String, Integer> map4 = new HashMap<>(map1);
            map4.keySet().removeAll(map2.keySet());
            System.out.println("After removeAll(): " + map4);
        }
    }


