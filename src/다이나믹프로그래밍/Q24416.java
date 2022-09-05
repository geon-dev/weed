package 다이나믹프로그래밍;

import java.util.*;

public class Q24416 {

	//https://www.acmicpc.net/problem/24416
	static int cnt;
	static int dpCnt;
	static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dp = new Integer[41];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		
		fib(N);
		fibonacci(N);
		System.out.print(cnt + " ");
		System.out.println(dpCnt);
		
		
	}
	
	static int fibonacci(int n) {
		for(int i=3; i <=n; i++) {
			dpCnt++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	static int fib(int n) {
		if(n == 1 || n == 2) {
			cnt++;
			return 1;
		}else {
			return fib(n-1) + fib(n-2);
		}
	}
			
			
			
			
			
			
			
			
			
}
