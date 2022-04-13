package test;

import java.io.*;
import java.util.*;

public class DFS_TEST02 {

	/*
입력  
5 5 3
5 4
5 2
1 2
3 4
3 1
	 */
	
	// 그래프 구현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정점, 간선, 시작
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		// 인접 리스트
		LinkedList<Integer>[] adjList = new LinkedList[n+1];
		
		// 방문 체크
		
		// 정점 개수만큼 선언
		// 간선
		// 방문 순서를 위한 오름차순

		//인접확인
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//인접 행렬
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정점, 간선, 시작
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();


		//인접 리스트
		LinkedList<Integer>[] adjList = new LinkedList[n+1];
		
		//방문 체크
		boolean[] visitied = new boolean[n+1];
		
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
		
		dfs(v, adjList, visitied);
	}
	
	static void dfs(int v, LinkedList<Integer>[] adjList, boolean[] visitied) {
		//방문체크
		visitied[v] = true;
		
		System.out.print(v + " > ");
		
		//인접확인
		for(int node : adjList[v]) {
			if(!visitied[node]) {
				dfs(node, adjList, visitied);
			}
		}
	}
	*/
	
	
	
	
	
	
	
	
	
	
}
