import java.util.*;
import java.io.*;
//This is 12 question of flow control statements topic
class fcb12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int num = sc.nextInt();
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Given Number is Prime Number");
		else
			System.out.println("Given Number is not Prime Number");
	}
}