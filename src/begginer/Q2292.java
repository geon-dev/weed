package begginer;

import java.util.*;

public class Q2292 {

	//https://www.acmicpc.net/problem/2292
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		//2~7 7-2+1=6
		//8~19 19-8+1=12
		//20~37 37-20+1=18
		//38~61 61-38+1=24
		//1 6++
		// [i-1]+1 ~ 6*i
		
		int N = sc.nextInt();
		
		int index = 0;
		int max = 1;
		while(max < N) {
			max = max + 6*index++;
		}
		
		if(N == 1) {
			index = 1;
		}
		System.out.println(index);
	}
	
	
	
	
	
	
}
