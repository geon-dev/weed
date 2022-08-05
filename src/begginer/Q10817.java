package begginer;

import java.util.*;

public class Q10817 {

	//https://www.acmicpc.net/problem/10817
	
	public static void main(String[] args) {
		//두번째로 큰수
		Scanner sc = new Scanner(System.in);
		
		// 정렬
		// 큐정렬 > 할때마다 정렬
		// 배열 1<= <=100

		int[] arr = new int[3];
		for(int i=0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
		
		
		
		
		
		
		
	}
	
}
