package 정렬;

import java.util.*;

public class Q2752 {

	//https://www.acmicpc.net/problem/2752
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		boolean[] bb = new boolean[1000000];
		for(int i=0; i < 3; i++) {
			bb[arr[i]] = true;
		}
		
		for(int i=0; i < bb.length; i++) {
			if(bb[i]) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
