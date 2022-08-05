package begginer;

import java.util.*;

public class Q2747 {

	//https://www.acmicpc.net/problem/2747
	
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		
		int[] arr = new int[N+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		System.out.println(arr[arr.length-1]);
		
	}
	
	
	
	
	
	
	
	
}
