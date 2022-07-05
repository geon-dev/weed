package 브루트포스;

import java.util.*;
import java.io.*;

public class Q15649_N과M {
	
	//https://www.acmicpc.net/problem/15649

	public static boolean[] visitied;
	public static int[] arr;
	
	public static void main(String[] args) {
		
		int N = 4;
		int M = 2;
		
		visitied = new boolean[N];
		arr = new int[M];
		
		dfs(N, M, 0);
	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i < N; i++) {
			if(!visitied[i]) {
				visitied[i] = true;
				arr[depth] = i + 1;
				
				dfs(N, M, depth+1);
				
				visitied[i] = false;
			}
		}
	}
	
	
	
	
	
}
