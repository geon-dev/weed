package 문자열;

import java.io.*;
import java.util.*;

public class Q2675_문자열반복 {
	// https://www.acmicpc.net/problem/2675
	
/*

2
3 ABC
5 /HTP
	
 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int q=0; q < T; q++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			for(int i=0; i < S.length(); i++) {
				for(int p=0; p < R; p++) {
					System.out.print(S.substring(i, i+1));
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
