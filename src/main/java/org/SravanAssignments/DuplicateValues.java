package org.SravanAssignments;
import java.util.Arrays;
public class DuplicateValues {
    public static void main(String[] args) {
        Integer[] in={1,0,3,0,3,3,4,2,0,7,0,7};
        Arrays.sort(in);
        System.out.println(Arrays.toString(in));
        int[] num= new int[in.length];
        int c=0;
        for (int i = 0; i < in.length-1; i++) {
          if(in[i]!=(in[i+1])){
              num[c++]=in[i];
            }
        }
        num[c++]=in[in.length-1];
        for(int i=0;i<c;i++){
            System.out.print(num[i]+" ");
        }

        //System.out.println(Arrays.toString(num));

    }
}

