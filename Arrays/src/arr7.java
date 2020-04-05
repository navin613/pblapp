import java.util.*;
import java.io.*;

public class arr7{  
public static int removeDuplicate(int a[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (a[i] != a[i+1]){  
                a[j++] = a[i];  
            }  
        }  
        a[j++] = a[n-1];     
        return j;  
    }  
       
    public static void main (String[] args) {  
        int a[] = {1,7,3,9,2,2,3,4,7,5};//unsorted array  
        int len = a.length;
        Arrays.sort(a);                 //sorting array
        len = removeDuplicate(a,len);
        for (int i=0; i<len; i++)  
           System.out.print(a[i]+" ");  
    }  
}
        
        