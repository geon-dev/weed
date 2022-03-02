package begginer;

import java.util.*;
import java.io.*;

public class Q17413_단어뒤집기2 {

	/*
	 * URL : https://www.acmicpc.net/problem/17413
	 * 제목 : 단어 뒤집기 2

	 * 
	 * 시간 : 17:15 > 17:35
	 * 
	 * 비고 :
	 * 
	 * 추후 :
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 입력
		
		// 태그 제외
		String input11 = "<open>tag<close>";
		// > 부터 < 까지 str[순번] 치환해서 입력
		process01(input11);
		
		
		
		// 공백으로 나누기
		String input22 = "baekjoon online judge";
		StringTokenizer stn = new StringTokenizer(input22);
		
		while(stn.hasMoreTokens()) {
			String str = stn.nextToken();
			
			// reverseStr
			String reverseStr = reverseProcess(str);
			System.out.println(reverseStr);
		}
		
		
		
		// 다시 재조합
		
		
		
		
		
	}
	
	static void process01(String input) {
		
		for(int i=0; i < input.length(); i++) {
			
			
			
		}
		
		
	}

	static String reverseProcess(String str) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i < str.length(); i++) {
			st.add(str.charAt(i));
		}
		
		while(st.size() > 0) {
			sb.append(st.pop());
		}
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
