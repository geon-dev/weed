package 자료구조;

import java.util.*;

public class Q3986 {

	//https://www.acmicpc.net/problem/3986

/*

3
ABAB
AABB
ABBA


1
ABBA

>> 2
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		int cnt = 0;

		while(N-- > 0) {
			String S = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			stack.push(S.charAt(0));
			
			for(int i=1; i < S.length(); i++) {
				char s = S.charAt(i);
	
				if(stack.isEmpty()) {
					// 없으면 넣고
					stack.push(s);
				}else if(s == stack.peek()) {
					// pop과 같으면 빼고
					stack.pop();
				}else {
					// pop과 아니면 넣고
					stack.push(s);
				}
			}
			
			if(stack.isEmpty()) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	
	
	
	
	
	
	
	
	
}
