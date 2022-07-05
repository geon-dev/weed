package 문자열;

import java.util.*;
import java.io.*;

public class Q11656_접미사배열 {
	//  https://www.acmicpc.net/problem/11656
	
	
	// input : baekjoon
	
	/*
aekjoon
baekjoon
ekjoon
joon
kjoon
n
on
oon
	 */
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String S = br.readLine();
		
		// 입력
		
		ArrayList<String> as = new ArrayList<String>();
		
		for(int i=0; i < S.length(); i++) {
			StringBuilder sb = new StringBuilder();
			
			for(int p=i; p < S.length(); p++) {
				char c = S.charAt(p);
				sb.append(c);
			}
			
			as.add(sb.toString());
		}
		
		Collections.sort(as);
		
		for(String v : as) {
			bw.write(v + "\n");
		}
		
		bw.flush();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
