package begginer;

import java.util.*;

public class Q2562 {

	//https://www.acmicpc.net/problem/2562
/*

3
29
38
12
57
74
40
85
61
	
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		for(int i=0; i < 9; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		// 최댓값, 순번
		int max = 0;
		// 최대인지
		for(int v : arr) {
			if(v > max) {
				max = v;
			}
		}
		System.out.println(max);
		
		// 값인지
		for(int i=0; i < 9; i++) {
			if(max == arr[i]) {
				System.out.println(i+1);
			}
		}
		
	}
	
	
}
