import java.util.*;
import java.io.*;
//This is 13 question of flow control statements topic
class fcb13{
	public static void main(String args[]){
		boolean flag = true;
		System.out.println("These are Prime Numbers");
		for(int i=10;i<99;i++){
			flag = true;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag==true)
				System.out.println(i);
		}
	}
}