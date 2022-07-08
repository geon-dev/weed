package 그리디;

import java.util.*;

public class Q2864_차이 {

	//https://www.acmicpc.net/problem/2864
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수의 가능한 합 중, 최솟값과 최댓값
		// 5 <> 6
		
		// 11 25 >> 36 37
		//1430 4862 >> 6282 6292
		
		String s1 = sc.nextInt() + "";
		String s2 = sc.nextInt() + "";
		
		// 입력값의 최소값 > 더하기 >> 6 > 5
		System.out.print(Integer.parseInt(s1.replace("6", "5")) + Integer.parseInt(s2.replace("6", "5"))); 
		
		System.out.print(" ");
		// 입력값의 최대값 > 더하기 >> 5 > 6
		System.out.print(Integer.parseInt(s1.replace("5", "6")) + Integer.parseInt(s2.replace("5", "6")));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
