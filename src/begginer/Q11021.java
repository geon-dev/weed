package begginer;

import java.util.*;

public class Q11021 {

	//https://www.acmicpc.net/problem/11021
	
	/*
Case #1: 1 + 1 = 2
Case #2: 2 + 3 = 5
Case #3: 3 + 4 = 7
Case #4: 9 + 8 = 17
Case #5: 5 + 2 = 7
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		
		for(int i=1; i <= M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + v1 + " + " + v2 + " = " + (v1+v2));
		}
	}
	
	
	
	
	
}
