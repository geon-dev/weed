package test;

import java.util.*;

public class Q2789 {

	//https://www.acmicpc.net/problem/2789
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		String C = "CAMBRIDGE";
		String result = "";
		
		for(int i=0; i < S.length(); i++) {
			char c = S.toCharArray()[i];
			
			boolean check = false;
			
			for(char cc : C.toCharArray()) {
				if(c == cc) {
					check = true;
				}
			}
			
			if(!check) {
				result += c;
			}
		}
		
		System.out.println(result);
	}
	
	
	
}
