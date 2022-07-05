package 문자열;

import java.util.*;

public class Q11720_숫자의합 {

	// https://www.acmicpc.net/problem/11720
	
	public static void main(String[] args) {
		// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
		// 둘째 줄에 숫자 N개가 공백없이 주어진다.
/*
5
54321
 */
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		
		int sum = 0;
		for(String s : S.split("")) {
			sum += Integer.parseInt(s);
		}

		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
