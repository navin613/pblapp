import java.util.*;
import java.io.*;
//This is 7 question of flow control statements topic
class fcb7{
	public static void main(String args[]){
		char ch = 'z';
		char res;
		if((int)ch>=97 && (int)ch <=122)
			res = (char)((int)ch - 32);
		else
			res = (char)((int)ch + 32);
		System.out.println(ch+"->"+res);
	}
}