import java.util.*;
import java.io.*;
//This is 15 question of flow control statements topic
class fcb15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0; 
		for(int i=num;i>0;){
			int r = i%10;
			i = i/10;
			sum += r;
		}
		System.out.println(sum);
	}
}