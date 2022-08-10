package 브루트포스;

import java.util.*;

public class Q1075 {

	//https://www.acmicpc.net/problem/1075
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		N = N/100 * 100;
		int result = 0;
		for(int i=0; i < 100; i++) {
			if((N + i) % F == 0) {
				result = i;
				break;
			}
		}
		
		if(result < 10) {
			System.out.println("0" + result);
		}else {
			System.out.println(result);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
