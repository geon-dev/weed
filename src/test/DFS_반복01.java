package test;

import java.util.*;

public class DFS_반복01 {
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
		
		int N = 5; // 노드
		int M = 5; // 간선
		int V = 3; // 시작
		
		List<Integer>[] list = new LinkedList[N+1];
		for(int i=0; i < N+1; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		boolean[] checked = new boolean[N+1];
		
		for(int i=0; i < M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for(int i=0; i < N+1; i++) {
			Collections.sort(list[i]);
		}
		
		dfs(list, checked, V);
		
	}
	
	static void dfs(List<Integer>[] list, boolean[] checked, int V) {
		checked[V] = true;
	
		System.out.println(V + " >> ");
		
		// v 점에서 >> 다음거
		// list[V] 에 다음 간선node 입력돼있음
		for(int v : list[V]) {
			if(!checked[v]) {
				dfs(list, checked, v);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
