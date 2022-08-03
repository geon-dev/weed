package test;

import java.util.*;

public class DFS_072701 {

	/*
입력  
5 5 3
5 4
5 2
1 2
3 4
3 1
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정점
		int N = sc.nextInt();
		// 간선
		int M = sc.nextInt();
		// 시작점
		int v = sc.nextInt();
		
		// 인접행렬
		// 인접배열
		List<Integer>[] arr = new ArrayList[N+1];
		for(int i=0; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}
		
		// 방문기록
		boolean[] check = new boolean[N+1];
		
		// 간선
		for(int i=0; i < M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			arr[v1].add(v2);
			arr[v2].add(v1);
		}
		
		// 방문순서를 위한 오름차순
		for(int i=0; i <= N; i++) {
			Collections.sort(arr[i]);
		}
		
		// dfs
		dfs(v, arr, check);
	}
	
	static void dfs(int v, List<Integer>[] arr, boolean[] check) {
		check[v] = true;
		
		System.out.println(v + " > ");
		
		//arr[] 이 여러개
		// 리스트 값들이 바라보는값
		for(int p : arr[v]) {
			if(!check[p]) {
				// 안간곳
				dfs(p, arr, check);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
}
