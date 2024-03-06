package org.VariableTypeConversions;

public class IntegerToString {
    public static void main(String[] args) {
        int i = 100;
        Long l=100L;
//        String str = i;//Complie time error
        String str = Integer.toString(i);
        String str1 = i + "";
        String longStr = Long.toString(l);
        l + ""
    }
}
