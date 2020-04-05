import java.util.*;
import java.io.*;
//This is 3 question of flow control statements topic
class fcb3{
	public static void main(String args[]){
		int n = args.length;
		if(n==0)
			System.out.println("No values");
		else{
			int i = 0;
			while(i<(n-1)){
				System.out.print(args[i]+",");
				i++;
			}
			System.out.print(args[i]);
		}
	}
}