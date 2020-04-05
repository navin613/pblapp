import java.util.*;
import java.io.*;

public class arr3 {

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int len = a.length;
        int search_num = 50;
        boolean flag = true;
        for(int i=0;i<len;i++){
            if(a[i]==search_num){
                System.out.println(i);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("-1");
        }
    }
}
