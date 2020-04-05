import java.util.*;
import java.io.*;
//This is 5 question of flow control statements topic
class fcb5{
	public static void main(String args[]){
		char ch = '4';
		if(((int)ch > 64 && (int)ch < 91) || ((int)ch > 96 && (int)ch < 123))
			System.out.println("Alphabhet");
		else if((int)ch > 47 && (int)ch <58)
			System.out.println("Digit");
		else 
			System.out.println("Special Character");
	}
}