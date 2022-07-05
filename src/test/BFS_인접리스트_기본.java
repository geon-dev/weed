package test;

import java.util.*;

public class BFS_인접리스트_기본 {

	/*
입력값
5 5 3
5 4
5 2
1 2
3 4
3 1

	 */
	
	
	// 기본_01
	// 그래프 표현 // 리스트 선언
	// 방문 여부를 검사할 배열
	// 간선 세팅
	// 정렬
	
	// bfs
	// 큐에 넣을게 없을때까지 확인
	// 방문체크
	// 큐
	// 큐에 없을때까지
	// 노드 체크
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 그래프 구현
		// 정점수
		// 간선수
		// 시작점
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		// 그래프 리스트
		List<Integer>[] adjList = new ArrayList[n+1];
		
		for(int i = 0; i <= n; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		// 방문세팅
		boolean[] visitied = new boolean[m+1];
		
		// 간선 세팅
		for(int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		
		// 정렬
		for(int i = 0; i <= n; i++) {
			Collections.sort(adjList[i]);
		}
		
		
		// dfs 큐
		dfs(adjList, v, visitied);
		
	}
	
	static void dfs(List<Integer>[] adjList, int v, boolean[] visitied) {
		// 방문체크
		visitied[v] = true;
		
		// 큐
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		
		// 큐에 없을때까지
		while(!queue.isEmpty()) {
			int value = queue.poll();
			
			System.out.print(value + " > ");
			
			// 노드 체크
			for(int node : adjList[value]) {
				if(!visitied[node]) {
					visitied[node] = true;
					queue.add(node);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정점
		// 간선
		// 시작
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
				
		// 그래프표현
		LinkedList<Integer>[] adjList = new LinkedList[n+1];
		
		for(int i=0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		// 방문 배열
		boolean[] visitied = new boolean[m+1];
		
		// 간선세팅
		for(int i=0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		
		// 정렬
		for(LinkedList<Integer> list : adjList) {
			Collections.sort(list);
		}
		
		bfs2(adjList, visitied, v);
	}
	
	static void bfs2(LinkedList<Integer>[] adjList, boolean[] visitied, int v) {
		visitied[v] = true;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		
		// 큐에 넣을게 없을때까지 확인
		while(!queue.isEmpty()) {
			v = queue.poll();
			
			System.out.print(v + " > ");
			
			for(int node : adjList[v]) {
				if(!visitied[node]) {
					visitied[node] = true;
					queue.add(node);
				}
			}
		}
	}
	
	
	
	
	
	
	
}
