package 브루트포스;

import java.util.*;
import java.io.*;

public class Q15650 {

	public static void main(String[] args) {
	
		//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
		//고른 수열은 오름차순이어야 한다.
		
		//첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
		
		// 3 1
		// 4 2
		int N = 4;
		int M = 2;
		
		
		for(int i=1; i <= N; i++) {
//			System.out.println(i+1);
			
			for(int p=i+1; p <= N; p++) {
				
				System.out.println(i +"/" + p);
				
			}
			
		}
		
				
		
		
		
		
	}
	
	
	
}
