import java.util.*;
import java.io.*;

public class arr8{
    public static void main(String args[]){
        int a[] = {10,3,6,1,2,7,9,6,8,7,8};
        int len = a.length;
        int index_of_six=0;
        int index_of_seven=0,sum=0;
        for(int i=0;i<len;i++){
            if(a[i]==6){
                index_of_six = i;
            }
            else if(a[i]==7 && i>index_of_six){
                index_of_seven = i;
                for(int j=index_of_six+1;j<index_of_seven;j++){
                    sum -= a[j];
                }
            }
            else{
                sum+=a[i];
            }
        }
        System.out.println("Sum is : "+sum);
    }
}  