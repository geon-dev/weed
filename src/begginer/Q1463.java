package begginer;

import java.util.*;

public class Q1463 {

	//https://www.acmicpc.net/problem/1463
	// TODO : 재귀 recur
	
	public static void main(String[] args) {
		// 10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.
		
		/*
X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
		 */
		int N = 16;

		// 14 7 6 2 1
		// 16 8 4 2 1
		// 17 16 > 4
		// 10 5 4 3 1
		
		// 3*x + 2*y + z = N
		
		int temp = N;
		int cnt = 0;
		
		int x = N/3;
		int y = N/2;
		int z = N;
		
			
		for(int i=0; i <= x; i++) {
			
			for(int p=0; p <= y; p++) {
				
				for(int q=0; q <= z; q++) {
					
					
					
					
					
					
				}
			}
		}
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
