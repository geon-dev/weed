package 그리디;

import java.util.*;

public class Q17224 {

	//https://www.acmicpc.net/problem/17224
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 문제수
		int L = sc.nextInt(); // 역량
		int K = sc.nextInt(); // 푸는수
		
		int[][] problem = new int[N][2];
		for(int i=0; i < N; i++) {
			problem[i][0] = sc.nextInt();
			problem[i][1] = sc.nextInt();
		}
		
		int sum = 0;
		int cnt = 0;
		
		for(int i=0; i < N; i++) {
			if(cnt >= K) break;

			int p2 = problem[i][1];

			if(p2 <= L) {
				System.out.println(p2);
				sum += 140;
				cnt = cnt + 1;
				problem[i][0] = 0;
			}
		}
		
		for(int i=0; i < N; i++) {
			if(cnt >= K) break;			
			if(problem[i][0] == 0) continue;
			
			int p1 = problem[i][0];
			if(p1 <= L) {
				System.out.println(p1);
				sum += 100;
				cnt = cnt + 1;
			}
		}
		
		System.out.println(sum);
	}
	
	
	
	
}
