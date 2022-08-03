package test;

import java.util.*;

public class Q1251 {

	//https://www.acmicpc.net/problem/1251
/*
단어 : arrested
세 단어로 나누기 : ar / rest / ed
각각 뒤집기 : ra / tser / de
합치기 : ratserde

단어가 주어지면, 이렇게 만들 수 있는 단어 중에서 사전순으로 
가장 앞서는 단어를 출력하는 프로그램을 작성하시오.

	
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int len = S.length();
		
		char[] arr = S.toCharArray();
		List<String> test = new ArrayList<>();
		
		for(int i=0; i < len-2; i++) {
			for(int p=i+1; p < len-1; p++) {
				String s1 = "";
				String s2 = "";
				String s3 = "";
				for(int v=0; v < len; v++) {
					if(v <= i) {
						s1 += arr[v];
					}else if(v <= p) {
						s2 += arr[v];
					}else {
						s3 += arr[v];
					}
				}
				
				test.add(reverse(s1) + reverse(s2) + reverse(s3));
			}
			
		}
		
		Collections.sort(test);
		System.out.println(test.get(0));
	}
	
	public static String reverse(String s) {
		String result = "";
		
		for(int i=s.length()-1; i >=0; i--) {
			result += s.toCharArray()[i];
		}
		
		return result;
	}
}
