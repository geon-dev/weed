package 정렬;

import java.util.*;

public class Q9076 {

	//https://www.acmicpc.net/problem/9076

/*

4
10 8 5 7 9
10 9 10 9 5
10 3 5 9 10
1 2 3 6 9

 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][]	arr = new int[N][];
		for(int i=0; i < N; i++) {
			arr[i] = new int[5];
			for(int p=0; p < 5; p++) {
				arr[i][p] = sc.nextInt();
			}
			Arrays.sort(arr[i]);
		}
		
		for(int i=0; i < N; i++) {
			if(arr[i][3] - arr[i][1] >= 4) {
				System.out.println("KIN");
				continue;
			}
			
			System.out.println(arr[i][1] + arr[i][2] + arr[i][3]);
		}
	}
	
	
	
	
	
	
	
	
}
