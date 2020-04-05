import java.util.*;
import java.io.*;

public class arr6 {
    
    void mergeSort(int a[],int begin,int mid, int end){
        int l = mid - begin +1;
        int r = end - mid;
        
        int left_array[] = new int [l];
        int right_array[] = new int [r];
        
        for(int i=0;i<l;i++){
            left_array[i]=a[begin+i];
        }
        for(int i=0;i<r;i++ ){
            right_array[i]=a[mid+1+i];
        }
        int i=0,j=0,k=begin;
        while(i<l && j<r){
            if(left_array[i]<=right_array[j]){
                a[k]=left_array[i];
                i++;
            }
            else{
                a[k]=right_array[j];
                j++;
            }
            k++;
        }
        while(i<l){
            a[k]=left_array[i];
            i++;
            k++;
        }
        while(j<r){
            a[k]=right_array[j];
            j++;
            k++;
        }
        
    }
    
    void sort(int a[],int begin,int end){
        if(begin<end){
            int mid = (begin+end)/2;
            sort(a,begin,mid);
            sort(a,mid+1,end);
            mergeSort(a,begin,mid,end);
        }
    }
    
    public static void main(String[] args) {
        int a[] = new int[]{5,4,3,2,1};
        int len = a.length;
        arr6 obj = new arr6();  // Creating object of class arr6 because we cannot access not static class via static class
        obj.sort(a,0,len-1);
        System.out.println("Sorted array is : ");
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}