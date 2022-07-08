package 브루트포스;

import java.util.*;

public class Q3040_백설공주 {

	//https://www.acmicpc.net/problem/3040
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[9];
		for(int i=0; i < 9; i++) {
			list[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i < 9; i++) {
			sum += list[i];
		}
		
		for(int i=0; i < 9; i++) {
			for(int p=0; p < 9; p++) {
				if(i == p) continue;
				
				if(sum - list[i] - list[p] == 100) {
					list[i] = 0;
					list[p] = 0;
					break;
				}
			}
		}
		
		Arrays.sort(list);
		
		for(int i : list) {
			if(i != 0) {
				System.out.println(i);
			}
		}
	}
	
	
	
}
