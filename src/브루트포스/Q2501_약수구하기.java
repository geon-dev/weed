package 브루트포스;

import java.util.*;

public class Q2501_약수구하기 {

	//https://www.acmicpc.net/problem/2501
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int check = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=1; i <= N; i++) {
			if(N % i == 0) {
				cnt++;
				if(cnt == check) {
					System.out.println(i);
					break;
				}
			}
		}
		
		if(cnt < check) {
			System.out.println(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
