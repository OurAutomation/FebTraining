package org.ArraysExample;

public class FindTheIndex {
    public static void main(String[] args) {
        String strArr[] = {"abc", "bca", "dfe"};
        String searchString = "bca";
        boolean isElementPresent = false;
        for (int i =0;i<strArr.length;i++) {
            if(strArr[i].equals(searchString)) {
                System.out.println("index is  :: " + i);
                break;
            }
        }
    }
}
