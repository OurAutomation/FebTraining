package org.StringPrograms;

public class MakeStartingCharacterOfTheWordAsCapital {
    static String str = "My name is tutor";

    //My Name Is Tutor
    // Split== Array
    // iterate through array first character uppercase
    public static void main(String[] args) {
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
        System.out.println(String.join(" ",strArr));
    }

}
