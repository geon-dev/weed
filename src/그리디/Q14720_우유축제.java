package 그리디;

import java.io.*;
import java.util.*;

public class Q14720_우유축제 {

	//https://www.acmicpc.net/problem/14720
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		String S = br.readLine();
		StringTokenizer st = new StringTokenizer(S);
		
		// 0, 1, 2 >> 순서로
		int check = 0;
		int cnt = 0;
		while(st.hasMoreTokens()) {
			int v = Integer.parseInt(st.nextToken());
			
			if(v == check) {
				cnt = cnt + 1;
				check = check + 1;
			}
			
			if(check > 2) {
				check = 0;
			}			
		}
		
		System.out.println(cnt);
	}
	
	
	
}
