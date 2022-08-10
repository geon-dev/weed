package 브루트포스;

import java.util.*;

public class Q2851 {

	//https://www.acmicpc.net/problem/2851
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 100에 가깝게
		// 100 - 20
		
		int sum = 0;
		int min = 100;
		int check = 0;
		for(int i=0; i < 10; i++) {
			int v = sc.nextInt();
			
			// 더한값
			sum += v;
			
			// 차이값
			if(min >= Math.abs(100 - sum)) {
				min = Math.abs(100 - sum);
				check = sum;
			}
		}
		
		System.out.println(check);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
