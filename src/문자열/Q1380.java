package 문자열;

import java.util.*;

public class Q1380 {

	//https://www.acmicpc.net/problem/1380
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		// 시나리오별 input 나누기
		// 안받은사람 찾기
		
		int series = 0;
		while(true) {
			series++;
			int N = sc.nextInt();
			if(N == 0) return;
			sc.nextLine();
			
			String[] arr = new String[N];
			for(int i=0; i < N; i++) {
				arr[i] = sc.nextLine();
			}
			
			int[] check = new int[N+1];
			for(int i=0; i < 2*N-1; i++) {
				int v = Integer.parseInt(sc.nextLine().split(" ")[0]);
				
				if(check[v] > 0) {
					check[v]--;
				}else {
					check[v]++;
				}
			}
			
			for(int i=1; i < check.length; i++) {
				if(check[i] > 0) {
					System.out.println(series + " " + arr[i-1]);
				}
			}

		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
