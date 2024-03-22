package org.SravanAssignments;
import java.util.Map;
import java.util.TreeMap;

public class CharRepandSortThem {
    public static void main(String[] args) {
        String r="rohithaisagoodgirl";
        TreeMap<Character,Integer> s=new TreeMap<>();
        for(char c: r.toCharArray()) {
            s.put(c, s.getOrDefault(c,0) + 1);
        }
        for(Map.Entry<Character, Integer> e:s.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
