package 브루트포스;

import java.util.*;

public class Q14697 {

	//https://www.acmicpc.net/problem/14697
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		
		boolean check = false;
		for(int i=0; i <= N/A; i++) {
			if(check) break;
			for(int p=0; p <= N/B; p++) {
				if(check) break;
				for(int q=0; q <= N/C; q++) {
					if(check) break;
					
					int sum = (A*i) + (B*p) + (C*q);
					
					if(N == sum) {
						check = true;
					}
				}
			}
		}
		
		if(check) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
		
		
	}
	
	
	
	
	
	
}
