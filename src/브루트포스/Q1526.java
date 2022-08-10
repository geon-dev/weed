package 브루트포스;

import java.util.*;

public class Q1526 {

	//https://www.acmicpc.net/problem/1526
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while(N >= 4) {
			int temp = N;
			
			boolean check = false;
			while(temp > 0) {
				int v = temp%10;
				
				if(!((v==4) || (v==7))) {
					check = true;
				}
				
				temp = temp/10;
			}
			
			if(!check) {
				System.out.println(N);
				break;
			}
			
			N--;
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
