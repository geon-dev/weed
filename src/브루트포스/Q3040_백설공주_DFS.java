package 브루트포스;

import java.util.*;

public class Q3040_백설공주_DFS {

	//https://www.acmicpc.net/problem/3040

	static List<Integer> data = new ArrayList<>();
	
	public static void main(String[] args) {
/*
 * 
8
6
5
1
37
30
28
22
36

 */
		// list
		// dfs
		data.add(8);
		data.add(6);
		data.add(5);
		data.add(1);
		data.add(37);
		data.add(30);
		data.add(28);
		data.add(22);
		data.add(36);
		
		dfs(0, 0);
		
	}

	private static void dfs(int cnt, int start) {
		System.out.println("cnt=" + cnt + "  / start=" + start);
		
		if(cnt == 2) return;
		
		System.out.println("======================");
		for(int i=start; i < 9; i++) {
			
			dfs(cnt+1, i+1);
			
		}
		System.out.println("======================");	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
