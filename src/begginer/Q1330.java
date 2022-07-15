package begginer;

import java.util.*;

public class Q1330 {

	//https://www.acmicpc.net/problem/1330
	
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		//process
		if(v1 > v2) {
			System.out.println(">");
		}else if(v2 > v1) {
			System.out.println("<");
		}else if(v1 == v2) {
			System.out.println("==");
		}
	}
	
	
	
	
	
	
}
