package begginer;

import java.util.*;

public class Q1546 {

	//https://www.acmicpc.net/problem/1546
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int max = 0;
		int[] arr = new int[N];
		for(int i=0; i < N; i++) {
			int v = sc.nextInt();
			arr[i] = v;
			
			if(max < v) {
				max = v;
			}
		}
		
		// 기존점수 / M * 100 >> 의 새로운 평균
		double sum = 0;
		for(int i=0; i < N; i++) {
			sum += arr[i] / (double)max * 100;
		}
		
		System.out.println(sum/N);
	}
	
}
