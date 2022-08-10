package test;

import java.util.*;

public class DFS_복습02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//노드
		//간선
		//시작
		int N = 5;
		int M = 5;
		int V = 3;
		
		//인접 리스트
		List<Integer>[] list = new LinkedList[N+1];
		for(int i=1; i <= N; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		// 방문
		boolean[] visited = new boolean[M+1];
		
		for(int i=1; i <= M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		// 정렬
		for(int i=1; i <= N; i++) {
			Collections.sort(list[i]);
		}
		
		bfs(list, visited, V);
		
	}
	
	static void bfs(List<Integer>[] list, boolean[] visited, int V) {
		visited[V] = true;
		
		System.out.println(V + " > ");
		
		for(int v : list[V]) {
			if(!visited[v]) {
				bfs(list, visited, v);
			}
		}
	}
	
	
	
	
	
	
	
	
}
