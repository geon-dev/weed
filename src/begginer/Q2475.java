package begginer;

import java.util.*;

public class Q2475 {

	//https://www.acmicpc.net/problem/2475
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 각자리 제곱 더한 후 10으로 나눈수
		// 0 4 2 5 6 >> 1
		
		int sum = 0;
		for(int i=0; i < 5; i++) {
			int v = sc.nextInt();
			
			sum += v*v;
		}
		
		System.out.println(sum%10);
	}
	
	
	
	
	
	
}
