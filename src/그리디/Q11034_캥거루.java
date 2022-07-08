package 그리디;

import java.util.*;

public class Q11034_캥거루 {

	//https://www.acmicpc.net/problem/11034
	
	
	public static void main(String[] args) {
		// 2 3 5 >> 1
		// 3 5 9 >> 3 
		
		// A, B, C가 주어진다. (0 < A < B < C < 100
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
	
			int AB = B-A;
			int CB = C-B;
			
			if(AB > CB) {
				System.out.println(AB-1);
			}else {
				System.out.println(CB-1);
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
