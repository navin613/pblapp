import java.util.*;
import java.io.*;
//This is 18 question of flow control statements topic
class fcb18{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int cpy = num;
		int cpy1 = num;
		int rev=0;
		boolean flag = true;
		while(cpy!=0){
			int r = cpy%10;
			rev = rev*10 + r;
			cpy=cpy/10;
		}
		while(num!=0 && rev!=0){
			int r1 = num%10;
			int r2 = rev%10;
			if(r1!=r2){
				flag = false;
				break;
			}
			num=num/10;
			rev=rev/10;
		}
		if(flag)
			System.out.println(cpy1+" is a Palindrome");
		else 
			System.out.println(cpy1+" is not a Palindrome");
	}
}
			
			