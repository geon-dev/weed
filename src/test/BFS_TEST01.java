package test;

import java.util.*;
import java.io.*;

public class BFS_TEST01 {

	static int[][] map;
	static boolean[] visited;
	static StringTokenizer st;
	static int N, M, start, end;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		// 선언
		map = new int[N+1][M+1];
		visited = new boolean[N+1];
		
		// 그래프 정보 입력
		for(int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			map[start][end] = 1;
			map[end][start] = 1;
		}
		
		/*
7
8
1 2
1 3
2 4
2 5
3 7
4 6
5 6
6 7

		 */
		
		bfs(1);
		
		
	}
	
	static void bfs(int point) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(point);
		visited[point] = true;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			
			System.out.print(x + " ");
			
			for(int i = 1; i <= N; i++) {
				if(map[x][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
