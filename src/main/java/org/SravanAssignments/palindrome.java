package org.SravanAssignments;
public class palindrome {
    public static void main(String[] args) {
        String str="class is not class";
        String reverse = new palindrome().reverseTheGivenString(str);
        //str=str.replaceAll("\\s+", "");
        if (reverse.equals(str)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
    public String reverseTheGivenString(String str){
            String reverseString = "";
            String[] s= str.split(" ");
            for (int i = s.length - 1; i >= 0; i--) {
                reverseString += s[i]+" ";

            }
            System.out.println(reverseString);

            return reverseString.substring(0,reverseString.length()-1);
        }
    }



