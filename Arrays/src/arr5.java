import java.util.*;
import java.io.*;

public class arr5 {

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int len = a.length;
        int max1, max2, min1, min2, temp;
        max1 = a[0];
        max2 = a[1];
        min1 = a[0];
        min2 = a[1];
        if (max1 < max2){
            temp = max1;
            max1 = max2;
            max2 = temp;
       	}
 
	for (int i = 2; i < a.length; i++){
            if (a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2 && a[i] != max1){
		max2 = a[i];
            }
	}
        
        if (min1 > min2){
            temp = min1;
            min1 = max2;
            min2 = temp;
       	}
 
	for (int i = 2; i < a.length; i++){
            if (a[i] < min1){
                min2 = min1;
                min1 = a[i];
            }
            else if (a[i] < min2 && a[i] != min1){
		min2 = a[i];
            }
	}
 
	System.out.println ("The First largest number is " + max1);
	System.out.println ("The Second largest  number is " + max2);
        System.out.println ("The First smallest number is " + min1);
	System.out.println ("The Second smallest number is " + min2);
    }
}
 
