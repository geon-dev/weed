package begginer;

import java.util.*;

public class Q2605 {

	//https://www.acmicpc.net/problem/2605
/*

5
0 1 1 3 2
	
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		
		int N = sc.nextInt();
		st1.push(sc.nextInt()+1);
		
		for(int p=1; p < N; p++) {
			int v = sc.nextInt();
			
			for(int i=0; i < v; i++) {
				st2.push(st1.pop());
			}
			
			st1.push(p+1);
			
			for(int i=0; i < v; i++) {
				st1.push(st2.pop());
			}			
			
		}
		
		for(int v : st1) {
			System.out.print(v + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
