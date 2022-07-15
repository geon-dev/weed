package begginer;

import java.util.*;

public class Q10872 {

	//https://www.acmicpc.net/problem/10872
	static int sum = 1;
	
	public static void main(String[] args) {
		int v1 = new Scanner(System.in).nextInt();
		
		nf(v1, 1);
		
		System.out.println(sum);
	}

	private static void nf(int v1, int i) {
		// 탈출
		if(i > v1) {
			return;
		}
		
		// 프로세스
		sum = sum * i;
		
		nf(v1, i+1);
	}
	
	
	
	
	
	
	
}
