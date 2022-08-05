package 자료구조;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Q2164 {

	//https://www.acmicpc.net/problem/2164

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i=1; i <= N; i++) {
			dq.addFirst(i);
		}
		
		Deque<Integer> remain = new ArrayDeque<>();
		while(dq.size() > 1) {
			remain.addLast(dq.removeLast());
			dq.addFirst(dq.removeLast());
		}
		
		System.out.print(dq.getFirst());
	}
	
}
