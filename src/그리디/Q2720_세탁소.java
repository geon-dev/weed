package 그리디;

import java.util.*;

public class Q2720_세탁소 {

	//https://www.acmicpc.net/problem/2720
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		
		while(T-- > 0) {
			int input1 = sc.nextInt(); // >> 4 2 0 4
			
			int Q = 25;
			int D = 10;
			int N = 5;
			int P = 1;
			
			String result = "";
			
			result = 몫(input1, Q) + " ";
			input1 = 나머지(input1, Q);
			
			result += 몫(input1, D) + " ";
			input1 = 나머지(input1, D);

			result += 몫(input1, N) + " ";
			input1 = 나머지(input1, N);

			result += 몫(input1, P) + " ";
			input1 = 나머지(input1, P);

			System.out.println(result);
		}
		
	}

	private static int 나머지(int input, int v) {
		return input - (input/v)*v;
	}

	private static int 몫(int input, int v) {
		return input/v;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
