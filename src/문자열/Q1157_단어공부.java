package 문자열;

import java.util.*;

public class Q1157_단어공부 {

	// https://www.acmicpc.net/problem/1157

	// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

	// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
	// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int[] M = new int[26];
		
		for(int i=0; i < S.length(); i++) {
			char s = S.charAt(i);
			
			if('A' <= s && s <= 'Z') {
				M[s - 'A'] += 1;
			} else {
				M[s - 'a'] += 1;
			}
		}
		
		int max = -1;
		char cnt = '?';
		for(int i=0; i < M.length; i++) {
			if(M[i] > max) {
				max = M[i];
				cnt = (char)(i + 65);
			}else if(M[i] == max) {
				cnt = '?';
			}
		}
		
		System.out.print(cnt);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
