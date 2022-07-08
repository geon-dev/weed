package 브루트포스;

import java.util.*;

public class Q5618_공약수 {

	//https://www.acmicpc.net/problem/5618
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
		List<Integer> data = new ArrayList<>();
		for(int i=0; i < M; i++) {
			data.add(sc.nextInt());
		}
		
		Collections.sort(data);
		
		for(int i=1; i <= data.get(0); i++) {
			int cnt = 0;
			
			for(int p=0; p < M; p++) {
				if(data.get(p) % i == 0) {
					cnt++;
				}
			}
			
			if(cnt == M) {
				System.out.println(i);
			}
		}
	}
	
	
}
