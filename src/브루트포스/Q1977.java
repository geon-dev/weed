package 브루트포스;

import java.util.*;

public class Q1977 {

	//https://www.acmicpc.net/problem/1977
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		int index = 1;
		while(true) {
			int v = index * index;
			
			if(v > N) {
				break;
			}
			
			if(v >= M) {
				list.add(v);
			}
			
			index++;
		}

		if(list.size() == 0) {
			System.out.println(-1);
		}else {
			int sum = 0;
			for(int v : list) {
				sum += v;
			}
			System.out.println(sum);
			

			Collections.sort(list);
			System.out.println(list.get(0));
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
