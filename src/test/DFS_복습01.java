package test;

import java.util.*;

public class DFS_복습01 {
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
		// 노드
		int N = 5;
		// 간선
		int M = 5;
		// 시작
		int v = 3;
		
		// 인접리스트
		List<Integer>[] list = new LinkedList[N+1];
		
		// 방문체크
		boolean[] visited = new boolean[M+1];
		
		for(int i=0; i <= N; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		// 간선
		for(int i=0; i < M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		// 방문순서 오름차순
		for(int i=0; i <= N; i++) {
			Collections.sort(list[i]);
		}
		
		// dfs
		dfs(list, visited, v);
	}
	
	static void dfs(List<Integer>[] list, boolean[] visited, int v) {
		visited[v] = true;
		
		System.out.println(v + " >> ");
		
		for(int i=0; i < list[v].size(); i++) {
			int V = list[v].get(i);
			if(!visited[V]) {
				dfs(list, visited, V);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
