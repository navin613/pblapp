import java.util.*;
import java.io.*;
//This is 17 question of flow control statements topic
class fcb17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String rev=""; 
		for(int i=num;i>0;){
			int r = i%10;
			i = i/10;
			rev=rev+r;
		}
		System.out.println(rev);
	}
}