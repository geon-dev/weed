package 문자열;

import java.util.*;

public class Q1969 {

	//https://www.acmicpc.net/problem/1969
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N은 1,000보다 작거나 같은 자연수이고, M은 50보다 작거나 같은 자연수이다.
		int N = sc.nextInt(); // DNA 수
		int M = sc.nextInt(); // 문자열 길이
		sc.nextLine();
		
		String[] str = {"A", "C", "G", "T"};
		int[][] arr = new int[M][4];
		
		String[] check = new String[N];
		for(int p=0; p < N; p++) {
			String s1 = sc.nextLine();
			check[p] = s1;
			
			// TAAGATAC 7
			// 각위치의 문자가 다름
			// Hamming Distance
			
			// 각 배열에서 많이 있는 문자로 만들기
			for(int i=0; i < M; i++) {
				char c = s1.toCharArray()[i];
				
				if(c == 'A') {
					arr[i][0]++;
				}else if(c == 'C') {
					arr[i][1]++;
				}else if(c == 'G') {
					arr[i][2]++;
				}else if(c == 'T') {
					arr[i][3]++;
				}
			}
			
		}

		String S = "";
		for(int p=0; p < M; p++) {
			int max = 0;
			String s = "";
			for(int i=0; i < 4; i++) {
				int v = arr[p][i];
				if(v > max) {
					max = v;
					s = str[i];
				}
			}
			S += s;
		}
		
		System.out.println(S);
		
		// 각 문자열끼리 Hamming Distance 구한 후 최소값
		int cnt = 0;
		for(int i=0; i < N; i++) {
			String s = check[i];
			
			for(int p=0; p < M; p++) {
				char c = s.toCharArray()[p];
				char cc = S.toCharArray()[p];
				
				if(c != cc) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
	
	
	
	
	
	
	
}
