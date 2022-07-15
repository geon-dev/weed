package 정렬;

import java.util.*;

public class Q5576 {

	//https://www.acmicpc.net/problem/5576
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[10];
		for(int i=0; i < 10; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[10];
		for(int i=0; i < 10; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int result1 = arr1[7] + arr1[8] + arr1[9];
		int result2 = arr2[7] + arr2[8] + arr2[9];
		
		System.out.println(result1 + " " + result2);
	}
	
	
	
	
	
	
}
