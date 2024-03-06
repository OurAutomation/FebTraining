package org.StringPrograms;

public class FindTheIndexOfGivenCharacter {
    public static void main(String[] args) {
        String str = "This is a test";
        char cha = 's';
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cha) {
                System.out.println("index is :: " + i);
                break;
            }
        }
        */

        /*for (int i = str.length()-1; i >0; i--) {
            if (str.charAt(i) == cha) {
                System.out.println("index is :: " + i);
                break;
            }
        }*/
        System.out.println(str.indexOf(cha));
        System.out.println(str.lastIndexOf(cha));
    }
}
