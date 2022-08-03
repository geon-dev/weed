package test;

import java.util.*;

public class Q16171 {

	//https://www.acmicpc.net/problem/16171

/*
첫 번째 줄에는 알파벳 소문자, 대문자, 숫자로 이루어진 문자열 S가 주어진다. 
(1 ≤ |S| ≤ 100) 두 번째 줄에는 성민이가 찾고자 하는 알파벳 소문자, 
대문자로만 이루어진 키워드 문자열 K가 주어진다. (1 ≤ |K| ≤ 100).
 */
	//연속된 문자열이 아니기때문에 찾고자 하는 키워드는 원래 문장에 존재하지 않는다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String K = sc.nextLine();
		
		String s2 = "";
		for(int i=0; i < S.length(); i++) {
			char c = S.toCharArray()[i];
			int v = (int)c;
			
			if(!(v >= 48 && v <= 57)) {
				s2 += c;
			}
		}

		System.out.println(s2.indexOf(K) > -1 ? 1 : 0);
	}
	
	
	
}
