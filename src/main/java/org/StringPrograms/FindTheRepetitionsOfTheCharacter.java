package org.StringPrograms;

//Print only unique characters
//Ignore case sensitive and print repetitions
public class FindTheRepetitionsOfTheCharacter {
    public static void main(String[] args) {
        String str = "This is a test";
        char cha = 's';
        /*int repetitions = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cha) {
                repetitions++;
            }
        }
        System.out.println("Number of times character repeated is :: " + repetitions);*/
        int initialLength = str.length();
        str = str.replace(cha + "", "");
        int finalLength = str.length();
        System.out.println("Number of times character repeated is :: " + (initialLength - finalLength));
    }
}
