package 구현;

import java.util.*;

class Q2739_구구단 {

	public static void main(String[] args) {

		//https://www.acmicpc.net/problem/2739
		
		//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		//출력형식과 같게 N*1부터 N*9까지 출력한다.
		
		int N = new Scanner(System.in).nextInt();
		for(int i=1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + (N*i));
		}


		
		
		
	}
}
