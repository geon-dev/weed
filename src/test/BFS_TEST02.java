package test;

import java.io.*;
import java.util.*;

public class BFS_TEST02 {
	
	public static void main(String[] args) throws Exception {
	
		// 그래프 표현
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정점
		int m = sc.nextInt(); // 간선
		int v = sc.nextInt(); // 탐색을 시작할 정점의 번호
		
		boolean visited[] = new boolean[n + 1]; // 방문 여부를 검사할 배열
		
		// 1.인접 리스트로 표현
		LinkedList<Integer>[] adjList = new LinkedList[n + 1];
		
		for(int i=0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		// 간선 세팅
		for(int i=0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		
		for(int i=1; i <= n; i++) {
			Collections.sort(adjList[i]);
		}
		
		System.out.println("BFS-인접리스트");
		bfs_list(v, adjList, visited);
		// 2.인접 행렬로 표현
		
		
		
	}
	
	static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[v] = true;
		
		queue.add(v);
		
		while(queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> iter = adjList[v].listIterator();
			while(iter.hasNext()) {
				int w = iter.next();
				if(!visited[w]) {
					visited[w] = true;
					queue.add(w);
				}
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}
