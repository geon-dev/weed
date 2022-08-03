package begginer;

import java.util.*;

public class Q2577 {

	//https://www.acmicpc.net/problem/2577
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a * b * c;
		
		// 배열
		String s = String.valueOf(sum);
		String[] ss = s.split("");
		
		int[] arr = new int[10];
		for(String v : ss) {
//			System.out.println(v);
			arr[Integer.parseInt(v)]++;
		}
		
		for(int i=0; i <= 9; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	
}
