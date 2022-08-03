package begginer;

import java.util.*;

public class Q3052 {

	
	//https://www.acmicpc.net/problem/3052
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 42로 나눈 나머지
		// 배열++
		// 0이아닌것
		// 나머지 0~41
		int[] arr = new int[42];
		for(int i=0; i < 10; i++) {
			int v = sc.nextInt();
			arr[v%42]++;
		}
		
		int cnt = 0;
		for(int v : arr) {
			if(v > 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
