import java.util.*;
import java.io.*;

public class arr2 {

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int len = a.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Maximum value of array is : " + max);
        System.out.println("Minimum value of array is : " + min);
    }
}