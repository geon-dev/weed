package test;

import java.util.*;
import java.io.*;

public class Q1476_브루트포스 {

	/*
	 * URL : https://www.acmicpc.net/problem/1476
	 * 제목 : 날짜 계산
	 * 
	 * 시간 : 17:20 > 17:55
	 * 
	 * 비고 :
	 * 
	 * 추후 :
	 * 
	 */
	
	public static void main(String[] args) {
		// 1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19
		
		// input
		// 1 16 16 >> 16
		
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().split(" ");
		
		int E = Integer.parseInt(ss[0]);
		int S = Integer.parseInt(ss[1]);;
		int M = Integer.parseInt(ss[2]);;
		
		int e,s,m;
		
		int year = 0;
		boolean brute = true;
		
		
		while(brute) {
			
			e = year%15 + 1;
			s = year%28 + 1;
			m = year%19 + 1;
			
			year++;
			
			if(e == E && s == S && m == M) brute = false;
		}
		
		System.out.println(year);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
