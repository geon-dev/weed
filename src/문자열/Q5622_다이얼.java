package 문자열;

import java.util.*;

public class Q5622_다이얼 {

	//https://www.acmicpc.net/problem/5622
	
	public static void main(String[] args) {
		String S = new Scanner(System.in).nextLine();
		int sum = 0;
		
		for(char c : S.toCharArray()) {
			if(c >= 'W') {
				sum += 10;
			}else if(c >= 'T') {
				sum += 9;
			}else if(c >= 'P') {
				sum += 8;
			}else if(c >= 'M') {
				sum += 7;
			}else if(c >= 'J') {
				sum += 6;
			}else if(c >= 'G') {
				sum += 5;
			}else if(c >= 'D') {
				sum += 4;
			}else if(c >= 'A') {
				sum += 3;
			}
		}
		
		System.out.println(sum);
		
	}
	
	
	
	
	
	
	
	
}
