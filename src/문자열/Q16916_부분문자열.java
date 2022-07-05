package 문자열;

import java.util.*;
import java.io.*;

public class Q16916_부분문자열 {
	// https://www.acmicpc.net/problem/16916
/*

baekjoon
nd

 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String P = br.readLine();
		
//		String S = "baekjoon";
//		String P = "baeko";
		
		Loop1 :
		for(int i=0; i < S.length(); i++) {
			char c = S.charAt(i);
			
			char p = P.charAt(0);
			if(c == p) {
				int v = 1;
				while(v < P.length()) {
					char pp = P.charAt(v);
					
					if(i+v >= S.length()) {
						System.out.println(0);
						break;
					}
					
					char cc = S.charAt(i + v);
					
					System.out.println(pp + "/" + cc);
					
					if(pp != cc) {
						System.out.println(0);
						break;
					}
					
					if(v == P.length()-1) {
						System.out.println(1);
						return;
					}
					
					v = v+1;
				}
				
			}
			
//			System.out.println(c);
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
