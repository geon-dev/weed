package 정렬;

import java.util.*;

public class Q2750 {

	// https://www.acmicpc.net/problem/2750
	// 수 정렬하기
	
	/*
	 * 선택정렬
	 * Arrays.sort // O(nlogn) ~ O(n2)
	 * 카운팅정렬
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean[] bb = new boolean[2001];
		for(int i=0; i < N; i++) {
			int v = sc.nextInt();
			
			bb[v] = true;
		}
		
		for(int i=0; i < bb.length; i++) {
			if(bb[i]) {
				System.out.println(i);
			}
		}
		
//		sort();
	}

	private static void sort() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
