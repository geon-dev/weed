package begginer;

import java.util.*;

public class Q2480 {

	//https://www.acmicpc.net/problem/2480
	
	/*
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		
		if(v1 == v2 && v2 == v3) {
			System.out.println(10000 + v1 * 1000);
		}
		
		if((v1 == v2 && v2 != v3)) {
			System.out.println(1000 + v1 * 100);
		}
		
		if((v2 == v3 && v1 != v2)) {
			System.out.println(1000 + v2 * 100);
		}
		
		if((v1 == v3 && v1 != v2)) {
			System.out.println(1000 + v1 * 100);
		}
		
		if(v1 != v2 && v1 != v3 && v2 != v3) {
			System.out.println(Math.max(Math.max(v1, v2), v3) * 100);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
