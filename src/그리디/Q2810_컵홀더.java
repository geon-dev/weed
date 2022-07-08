package 그리디;

import java.util.*;

public class Q2810_컵홀더 {

	// https://www.acmicpc.net/problem/2810
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 컵홀더 최대 사용가능
		// 좌석수 + 1 - 커플석
		
		int M = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		
		S = S.replace("LL", "X");
		S = S.replace("S", "");
		
		int couple = S.length();
		int max = M + 1 - couple;
		if(max > M) max = M;
		
		System.out.println(max);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
