import java.util.*;
import java.io.*;

public class arr1 {

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int len = a.length;
        int sum = 0;
        double avg;
        for(int i=0;i<len;i++){
            sum+=a[i];
        }
        System.out.println("Sum of array is :"+sum);
        System.out.println("Average of array is :"+((double)sum/len));
    }
    
}
