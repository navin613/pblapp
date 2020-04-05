import java.util.*;
import java.io.*;
//This is 1 question of flow control statements topic
class fcb1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();  // Taking Integer input from user 
		if(a>0)
			System.out.println("Positive Number");
		else if(a==0)
			System.out.println("Zero");
		else
			System.out.println("Negative Number");
	}
}