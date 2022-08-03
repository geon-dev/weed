package begginer;

import java.util.*;

public class Q1085 {

	//https://www.acmicpc.net/problem/1085
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int wx = w-x;
		int hy = h-y;
		
		int min = Math.min(Math.min(Math.min(wx, hy), x), y);
		
		System.out.println(min);
	}
	
	
	
	
	
	
	
}
