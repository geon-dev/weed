package 문자열;

import java.util.*;

public class Q2908_상수 {
	//https://www.acmicpc.net/problem/2908
	
	public static void main(String[] args) {
		String S = new Scanner(System.in).nextLine();
		
		String s1 = S.split(" ")[0];
		String s2 = S.split(" ")[1];
		
		System.out.println(거꾸로(s1) > 거꾸로(s2) ? 거꾸로(s1) : 거꾸로(s2));
	}
	
	static int 거꾸로(String s) {
		String reverse = "";
		
		for(int i=s.length()-1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		
		return Integer.parseInt(reverse);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
