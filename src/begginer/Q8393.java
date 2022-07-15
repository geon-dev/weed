package begginer;

import java.util.*;

public class Q8393 {

	//https://www.acmicpc.net/problem/8393
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		
		int sum = v;
		for(int i=1; i < v; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
	
	
	
	
	
}
