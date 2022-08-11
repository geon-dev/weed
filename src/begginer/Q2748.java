package begginer;

import java.util.*;

public class Q2748 {

	//https://www.acmicpc.net/problem/2748
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fn = Fn-1 + Fn-2
		
		int N = sc.nextInt();
		
		long[] check = new long[N+1];
		
		check[0] = 0;
		check[1] = 1;
		System.out.println(recur(N, check));
		
		
	}
	
	static long recur(int n, long[] check) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else if(check[n] == 0) {
			check[n] = recur(n-1, check) + recur(n-2, check);
		}
		
		return check[n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
