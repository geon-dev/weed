package 브루트포스;

import java.util.*;

public class Q1018 {

	//https://www.acmicpc.net/problem/1018
	
/*
10 10
BBBBBBBBBB
BBWBWBWBWB
BWBWBWBWBB
BBWBWBWBWB
BWBWBWBWBB
BBWBWBWBWB
BWBWBWBWBB
BBWBWBWBWB
BWBWBWBWBB
BBBBBBBBBB
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		// TODO : 좌우 그다음칸, https://yeongjin13.tistory.com/58
		
		// 처음 흑, 백
		// boolean 64
		// 처음값부터 순서대로
		String s1 = "BBBBBBBBBB";
		
		for(int i=0; i < 1; i++) { // 세로
			for(int p=0; p < 1; p++) { //가로
				// 0, 0 첫번째만
				boolean[] arr = new boolean[64];
				int index = 0;
				int cnt = 0;
				for(int q=i; q < 8+i; q++) { // y
					String s = sc.nextLine();
					
					for(int w=p; w < 8+p; w++) { //x
						char c = s.charAt(w);
						
						if(c == 'W') {
							arr[index] = true;
						}else {
							arr[index] = false;
						}
						
						if(index==0) {
							
						}else if(arr[index-1] == arr[index]) {
							cnt++;
						}
						
						index++;
					}
				}
				
				System.out.println(cnt);
			}
		}
		
		
		
		
		
	}
	
	static char swit(char c) {
		if(c == 'W') {
			return 'B';
		}else {
			return 'W';
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
