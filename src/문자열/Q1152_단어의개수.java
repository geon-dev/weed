package 문자열;

import java.io.*;
import java.util.*;

public class Q1152_단어의개수 {

	//https://www.acmicpc.net/problem/1152
	
	public static void main(String[] args) {
		//단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
		//또한 문자열은 공백으로 시작하거나 끝날 수 있다.
		
		String s1 = "The Curious Case of Benjamin Button";
		String s2 = " The first character is a blank";
		String s3 = "The last character is a blank ";
		
		
		
		System.out.println(new StringTokenizer(new Scanner(System.in).nextLine()).countTokens());
		
		
		
	}
	
	
	
	
	
	
	
}
