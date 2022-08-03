package DFS;

import java.util.*;

public class Q2606 {

	//https://www.acmicpc.net/problem/2606
	
/*

7
6
1 2
2 3
1 5
5 2
5 6
4 7
	
 */
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//정점
		int N = sc.nextInt();
		//간선
		int M = sc.nextInt();
		//시작
		int v = 1;
		
		//행렬 선언
		int[][] arr = new int[N+1][N+1];
		for(int i=0; i < M; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			
			arr[t1][t2] = 1;
			arr[t2][t1] = 1;
		}
		
		//방문 체크
		boolean[] check = new boolean[N+1];
		
		//dfs
		dfs(v, arr, check);
		System.out.println(cnt-1);
	}

	private static void dfs(int v, int[][] arr, boolean[] check) {
		//방문 체크
		check[v] = true;
		cnt++;
//		System.out.println(v + " > ");
		
		//아니면 dfs
		for(int i=1; i <= arr[v].length-1; i++) {
			if(arr[v][i] == 1 && !check[i]) {
				dfs(i, arr, check);
			}
		}
	}
	
	
	
	
	
	
}
