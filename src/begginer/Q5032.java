package begginer;

import java.util.*;

public class Q5032 {

	//https://www.acmicpc.net/problem/5032
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = e + f;
		int count = 0;
		while(sum/c > 0) {
			count += (sum/c);
			sum = sum - (sum/c)*c + (sum/c);
		}
		
		System.out.println(count);
		
		
	}
	
	
	
	
	
	
	
	
	
}
