import java.util.*;
import java.io.*;
//This is 14 question of flow control statements topic
class fcb14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int len = args.length;
		int num = Integer.parseInt(args[0]);
		if(len==0)
			System.out.println("Please enter an integer number");
		else if(len!=0 && num==1)
			System.out.println("1 is neither prime nor composite");
		else if(len!=0 && num==0)
			System.out.println("0 is neither prime nor composite");
		else{
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
}