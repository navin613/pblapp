import java.util.*;
import java.io.*;

public class arr9{
    public static void main(String args[]){
        if(args.length!=4)
            System.out.println("Please enter 4 integer numbers");
        else{
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        a[0][0] = Integer.parseInt(args[0]);
        a[0][1] = Integer.parseInt(args[1]);
        a[1][0] = Integer.parseInt(args[2]);
        a[1][1] = Integer.parseInt(args[3]);
        System.out.println("The given array is :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=a[2-i][2-j];
            }
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
}