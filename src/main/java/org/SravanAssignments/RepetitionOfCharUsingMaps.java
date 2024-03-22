package org.SravanAssignments;

import java.util.*;
//1. Using maps print the characters in a string which are repeated only once
//2. Using scanner class retrieve names and marks from console and store it in map and print them
//3. Work on putAll and RemoveAll
//4. Explore values() and GetOrDefault()
//5. Using tree map from a string print all the characters and repetitions in sorting order
//Ex:- String str = "aancgbhwefdbsfhvb";
//1, (b,w,s)
//2,
//Read data from one text file and write it to another text file (delete and create a new file)


public class RepetitionOfCharUsingMaps {
    public static void main(String[] args) {
        String r="rohithaisagoodgirl";
        Map<Character,Integer> s=new HashMap<>();
        for(char c: r.toCharArray()) {
         s.put(c, s.getOrDefault(c,0) + 1);
        }
        for(char c:r.toCharArray()){
            if(s.get(c)==1){
                System.out.println(c);
            }
        }
    }}
