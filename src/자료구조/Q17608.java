package 자료구조;

import java.util.*;

public class Q17608 {

	//https://www.acmicpc.net/problem/17608

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		for(int i=0; i < N; i++) {
			st.push(sc.nextInt());
		}
		
		int max = st.pop();
		int cnt = 1;
		
		while(!st.isEmpty()) {
			int v = st.pop();
			if(max < v) {
				max = v;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
