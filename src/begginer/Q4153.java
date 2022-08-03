package begginer;

import java.util.*;

public class Q4153 {

	//https://www.acmicpc.net/problem/4153

	/*
6 8 10
25 52 60
5 12 13
0 0 0
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1;
		while((v1= sc.nextInt()) != 0) {
			int v2 = sc.nextInt();
			int v3 = sc.nextInt();
			
			// 제곱합끼리 같으면
			int sum12 = v1*v1 + v2*v2;
			int sum13 = v1*v1 + v3*v3;
			int sum23 = v2*v2 + v3*v3;
			
			if(sum12 == v3*v3 || sum13 == v2*v2 || sum23 == v1*v1) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
	
	
	
	
	
	
	
}
