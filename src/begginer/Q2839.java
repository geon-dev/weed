package begginer;

import java.util.*;

public class Q2839 {

	//https://www.acmicpc.net/problem/2839
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 3, 5킬로
		// N  3 ~ 5000
		// 최소 봉지
		int N = sc.nextInt();
		// >> 4

		// 5 나누기, 후에 3나누기
		// N킬로 안되면 -1
		// 최대 해서 안되면
		// 5 x -- 하면서 되는지
		
		int x = N/5;
		
		while(x >= 0) {
			int n = N - (5 * x);
			
			if(n%3 == 0) {
				x += n/3;
				break;
			}else {
				x--;
			}
		}
		
		System.out.println(x);
		
		
		
	}
	
	
	
	
	
	
	
}
