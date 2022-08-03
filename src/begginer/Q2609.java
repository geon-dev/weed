package begginer;

import java.util.*;

public class Q2609 {

	//https://www.acmicpc.net/problem/2609
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		
		int min = Math.min(in1, in2);
		boolean minCheck = false;
		while(!minCheck) {
			if(in1%min == 0 && in2%min == 0) {
				System.out.println(min);
				minCheck = true;
			}
			
			min--;
		}
		
		// 최소공배수
		// 큰값 * 곱 = 작은값으로 나눠지나
		int max = Math.max(in1, in2);
		int i = 1;
		boolean maxCheck = false;
		
		while(!maxCheck) {
			int v = max * i++;
			if(v % Math.min(in1, in2) == 0) {
				System.out.println(v);
				maxCheck = true;
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
