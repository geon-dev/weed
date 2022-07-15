package begginer;

import java.util.*;

public class Q2439 {

	// https://www.acmicpc.net/problem/2439
	
	public static void main(String[] args) {
		int M = new Scanner(System.in).nextInt();
		
		String S = "";
		
		for(int i=0; i < M; i++) {
			String pre = "";
			for(int p=M-1-i; p > 0; p--) {
				pre += " ";
			}
			
			S += "*";
			System.out.println(pre + S);
		}
	}
	
	
	
}
