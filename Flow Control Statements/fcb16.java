import java.util.*;
import java.io.*;
//This is 16 question of flow control statements topic
class fcb16{
	public static void main(String args[]){
		int len = args.length;
		if(len==0)
			System.out.println("Please enter an integer number");
		else{
			int num = Integer.parseInt(args[0]);
			for(int i=1;i<=num;i++){
				for(int j=1;j<=i;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}