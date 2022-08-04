package begginer;

import java.util.*;

public class Q5054 {
	
	//https://www.acmicpc.net/problem/5054
/*

2
4
24 13 89 37
6
7 30 41 14 39 42
	
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트케이스
		
		while(t-- > 0) {
			int n = sc.nextInt();
			
			int max = 0;
			int min = 99;
			for(int i=0; i < n; i++) {
				int v = sc.nextInt();
				
				if(max < v) {
					max = v;
				}
				
				if(min > v) {
					min = v;
				}
			}
			
			System.out.println((max-min)*2);
		}
		
		
		
		
		
		
	}
	
	
	
}
