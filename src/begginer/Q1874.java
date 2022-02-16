package begginer;

import java.util.*;

/*
 * https://www.acmicpc.net/problem/1874
 * 
 * 스택 수열
 * 
 */
public class Q1874 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int start = 0;
		
		// 반복
		while(N-- > 0) {
			
			int input = sc.nextInt();
			
			if(input > start) {
				// 스택 push
				for(int i = start + 1; i <= input ; i++ ) {
					st.push(i);
					sb.append("+").append("\n");
				}
				
				start = input;
			} else if(st.peek() != input) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append("-").append("\n");

		}
		
		System.out.println(sb);
	}
	
	static void asfkl() {

		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);

		sb.append(st.pop());
		sb.append(st.pop());
		
		st.push(5);
		st.push(6);
		
		sb.append(st.pop());
		
		st.push(7);
		st.push(8);
		
		sb.append(st.pop());
		sb.append(st.pop());
		sb.append(st.pop());
		sb.append(st.pop());
		sb.append(st.pop());
		
		System.out.println("st = " + st);
		System.out.println("sb = " + sb);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
