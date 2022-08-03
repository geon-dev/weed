package 문자열;

import java.util.*;

public class Q1427 {

	//https://www.acmicpc.net/problem/1427
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int[] arr = new int[10];
		
		for(int i=0; i < S.length(); i++) {
			String s = S.split("")[i];
			arr[Integer.parseInt(s)]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=9; i >=0; i--) {
			int cnt = arr[i];
			
			if(cnt != 0) {
				for(int p=0; p < cnt; p++) {
					sb.append(i);
				}
			}
		}

		System.out.println(sb.toString());
		
	}
	
	
	
	
	
	
	
	
	
}
