package 구현;

import java.util.*;

public class Q2438_별찍기1 {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/2438
		
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, 
		//N번째 줄에는 별 N개를 찍는 문제

		int N = new Scanner(System.in).nextInt();
		
		for(int i=0; i < N; i++) {
			for(int p=0; p <= i; p++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	}
}
