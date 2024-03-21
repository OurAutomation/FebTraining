package org.ArraysExample;

public class SearchForGivenElement {
    public static void main(String[] args) {
        String strArr[] = {"abc", "bca", "dfe"};
        String searchString = "a5bc";
        boolean isElementPresent = false;
        for (String s : strArr) {
            if(s.equals(searchString)) {
                isElementPresent = true;
                break;
            }
        }
        System.out.println(isElementPresent);
    }
}
