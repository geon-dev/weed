package 그리디;

import java.util.*;

public class Q14659 {

	// https://www.acmicpc.net/problem/14659
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int[] list = new int[M];
		
		for(int i=0; i < M; i++) {
			list[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i=0; i < M; i++) {
			int v = list[i];
			
			int cnt = 0;
			for(int p=i+1; p < M; p++) {
				int check = list[p];
				
				if(v > check) {
					cnt = cnt + 1;
				}else {
					break;
				}
			}
			
			if(cnt > max) {
				max = cnt;
			}
		}
		
		System.out.println(max);
	}
	
}
