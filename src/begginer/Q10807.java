package begginer;

import java.util.*;

public class Q10807 {

	//https://www.acmicpc.net/problem/10807
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i < N; i++) {
			int v = sc.nextInt();
			arr[i] = v;
		}
		
		int search = sc.nextInt();
		int cnt = 0;
		for(int v : arr) {
			if(v == search) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	
	
	
	
}
