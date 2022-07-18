package begginer;

import java.util.*;

public class Q5597 {

	//https://www.acmicpc.net/problem/5597
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] bb = new boolean[31];
		for(int i=1; i < 31; i++) {
			bb[i] = false;
		}
		
		for(int i=0; i < 28; i++) {
			int v = sc.nextInt();
			bb[v] = true;
		}
		
		for(int i=1; i < 31; i++) {
			if(!bb[i]) {
				System.out.println(i);
			}
		}
	}
	
	
}
