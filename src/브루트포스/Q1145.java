package 브루트포스;

import java.util.*;

public class Q1145 {

	//https://www.acmicpc.net/problem/1145
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 적어도 3개
		// 30 42 70 35 90 >> 210
		
		// list .. 나누기
		// max값부터 ++
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		int max = 1;
		
		while(true) {
			int cnt = 0;
			
			for(int i=0; i < 5; i++) {
				if(max % list.get(i) == 0) {
					cnt++;
				}
			}
			
			if(cnt >= 3) {
				System.out.println(max);
				break;
			}
			
			max++;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
