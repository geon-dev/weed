package begginer;

import java.util.*;

public class Q10871 {

	//https://www.acmicpc.net/problem/10871
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
10 5
1 10 4 9 2 3 8 5 7 6
 */
		int M = sc.nextInt();
		int max = sc.nextInt();
		
		for(int i=0; i < M; i++) {
			int v = sc.nextInt();
			
			if(v >= max) continue;
			
			System.out.print(v);
			System.out.print(" ");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
