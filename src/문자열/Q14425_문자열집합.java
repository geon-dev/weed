package 문자열;

import java.io.*;
import java.util.*;

public class Q14425_문자열집합 {

	//https://www.acmicpc.net/problem/14425
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer(input1);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] S = new String[N];
		for(int i=0; i < N; i++) {
			S[i] = br.readLine();
		}
		
		String[] T = new String[M];
		for(int i=0; i < M; i++) {
			T[i] = br.readLine();
		}
		
		int count = 0;
		for(int i=0; i < N; i++) {
			for(int p=0; p < M; p++) {
				if(S[i].equals(T[p])) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
	
}
