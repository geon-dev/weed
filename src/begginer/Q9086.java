package begginer;

import java.util.*;

public class Q9086 {

	//https://www.acmicpc.net/problem/9086
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i < M; i++) {
			String S = sc.nextLine();
			
			String s1 = S.substring(0, 1);
			String s2 = S.substring(S.length()-1, S.length());
			
			System.out.println(s1 + s2);
		}
	}
	
	
	
	
	
	
}
