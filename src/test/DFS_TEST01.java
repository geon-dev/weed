package test;

import java.util.*;
import java.io.*;

public class DFS_TEST01 {

	static boolean[] visitied = new boolean[9];
	
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		//dfs(1);
	
		stack.push(1);
		
		visitied[1] = true;
		
		while(!stack.isEmpty()) {
			int nodeIndex = stack.pop();
			
			System.out.print(nodeIndex + " > ");
			
			for(int linkedNode : graph[nodeIndex]) {
				if(!visitied[linkedNode]) {
					stack.push(linkedNode);
					visitied[linkedNode] = true;
				}
			}
			
		}
		
	}
	
	static void dfs(int nodeIndex) {
		//방문 처리
		visitied[nodeIndex] = true;
		
		//방문 노드 출력
		System.out.print(nodeIndex + " > ");
		
		//방문 노드에 인접한 노드 찾기
		for(int node : graph[nodeIndex]) {
			if(!visitied[node]) {
				dfs(node);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
