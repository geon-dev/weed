package begginer;

import java.util.*;

public class Q10818 {

	// https://www.acmicpc.net/problem/10818
/*

5
-20 -10 -35 -30 -7 
	
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 최소 최대
		int N = sc.nextInt();
		
		int min = -1000000;
		int max = -1000000;
		
		for(int i=0; i < N; i++) {
			int v = sc.nextInt();
			
			if(i == 0) min = v;
			
			if(max < v) {
				max = v;
			}
			
			if(min > v) {
				min = v;
			}
		}
		
		System.out.println(min + " " + max);
	}
	
	
	
	
	
	
	
	
}
