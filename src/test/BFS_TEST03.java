package test;

import java.util.*;

public class BFS_TEST03{

	public static void main(String[] args) throws Exception {
		int[] numbers = {1, 2, 3, 4, 5};
		boolean[] visit = {false, false, false, false, false};
		  
		BFS(numbers, 0, visit);
		
	}
	
	static void BFS(int[] numbers, int start, boolean[] visit) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visit[start] = true;
		
		while(!queue.isEmpty()) {
			int next = queue.poll();
			
			System.out.print(next + " ");
			
			for(int i = 0; i < numbers.length; i++) {
				if(!visit[i]) {
					queue.offer(i);
					visit[i] = true;
				}
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
