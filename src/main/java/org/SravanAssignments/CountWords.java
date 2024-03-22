package org.SplitAssignment;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println("Enter the Sentence: ");
        String findStr = str.nextLine();
        String[] split = s.split(" , ");
        for (int i = 0; i <= split.length; i++) {
            if (split[i].trim().equalsIgnoreCase(findStr.trim())) {
                System.out.println(i);
            }
        }


    }
}
//print the repetitions of the word in a sentence
//String.split(" ");
//if word is equalsignorecase to the given word
//count print

