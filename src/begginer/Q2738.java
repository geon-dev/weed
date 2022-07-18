package begginer;

import java.util.*;

public class Q2738 {

	//https://www.acmicpc.net/problem/2738
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//NXM
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//행렬 A
		int[][] arr1 = new int[N][M];
		//행렬 B
		int[][] arr2 = new int[N][M];
		
		for(int i=0; i < N; i++) {
			for(int p=0; p < M; p++) {
				arr1[i][p] = sc.nextInt();
			}
		}
		
		for(int i=0; i < N; i++) {
			for(int p=0; p < M; p++) {
				int v = sc.nextInt() + arr1[i][p];
				
				System.out.print(v + " ");
			}
			
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
}
