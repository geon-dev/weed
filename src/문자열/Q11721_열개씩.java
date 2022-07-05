package 문자열;

import java.util.*;

public class Q11721_열개씩 {

	// https://www.acmicpc.net/problem/11721
	public static void main(String[] args) {
		String S = new Scanner(System.in).nextLine();
		
		for(int i=0; i < S.length(); i++) {
			char c = S.charAt(i);
			
			System.out.print(c);
			
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
}
