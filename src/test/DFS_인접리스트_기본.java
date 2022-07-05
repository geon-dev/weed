package test;

import java.util.*;

public class DFS_인접리스트_기본 {
	/*
입력  
5 5 3
5 4
5 2
1 2
3 4
3 1
	 */
	
	// 정점, 간선, 시작
	// 인접 리스트
	// 방문 체크
	// 정점 개수만큼 선언
	// 간선
	// 방문 순서를 위한 오름차순

	// 인접확인
	// 인접리스트의 노드들 확인
	
	
	public static void main(String[] arsg) {
		Scanner sc = new Scanner(System.in);
		
		// 정점, 간선, 시작
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		// 인접 리스트
		List<Integer>[] adjList = new LinkedList[n+1];
		
		// 방문 체크
		boolean[] visitied = new boolean[m+1];
		
		// 정점 개수만큼 선언
		for(int i = 0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		// 간선
		for(int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		
		// 방문 순서를 위한 오름차순
		for(int i = 0; i <= n; i++) {
			Collections.sort(adjList[i]);
		}

		//인접확인	
		dfs(adjList, visitied, v);
		
	}

	private static void dfs(List<Integer>[] adjList, boolean[] visitied, int v) {
		visitied[v] = true;
		
		System.out.print(v + " > ");

		// 인접리스트의 노드들 확인
		for(int node : adjList[v]) {
			if(!visitied[node]) {
				dfs(adjList, visitied, node);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

	
}
