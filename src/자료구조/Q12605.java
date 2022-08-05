package 자료구조;

import java.io.*;
import java.util.*;

public class Q12605 {

	//https://www.acmicpc.net/problem/12605
/*
3
this is a test
foobar
all your base	
 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i < N; i++) {
			String S = br.readLine();
			StringTokenizer st = new StringTokenizer(S);
			Stack<String> stack = new Stack<>();
			while(st.hasMoreTokens()) {
				stack.push(st.nextToken());
			}
			
			StringBuilder sb = new StringBuilder();
			while(!stack.isEmpty()) {
				sb.append(stack.pop() + " ");
			}
			//Case #1: 
			System.out.println("Case #" + (i+1) + ": "+ sb.substring(0, sb.length()-1));
		}
		
	}
	
	
	
	
	
	
}
