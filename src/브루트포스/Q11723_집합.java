package 브루트포스;

import java.util.*;
import java.io.*;

public class Q11723_집합 {
	// https://www.acmicpc.net/problem/11723
	

	/*
	 * 
	  	비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
		add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
		remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
		check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
		toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
		all: S를 {1, 2, ..., 20} 으로 바꾼다.
		empty: S를 공집합으로 바꾼다.
 
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int S = 0;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String v1 = st.nextToken();
			
			if(v1.equals("add")) {
				int v2 = Integer.parseInt(st.nextToken());
				S = add(S, v2);
			}else if(v1.equals("remove")) {
				int v2 = Integer.parseInt(st.nextToken());
				S = remove(S, v2);
			}else if(v1.equals("check")) {
				int v2 = Integer.parseInt(st.nextToken());
				sb.append(check(S, v2) + "\n");
			}else if(v1.equals("toggle")) {
				int v2 = Integer.parseInt(st.nextToken());
				S = toggle(S, v2);
			}else if(v1.equals("all")) {
				S = all(S);
			}else if(v1.equals("empty")) {
				S = empty(S);
			}
		}
		
		System.out.println(sb);
	}
	
	public static int all(int S) {
		return (1 << 21) - 1;
	}
	
	public static int empty(int S) {
		return 0;
	}
	
	public static String check(int S, int x) {
		if((S & (1 << x)) == (1 << x)) {
			return "1";
		}else {
			return "0";
		}
	}
	
	public static int toggle(int S, int x) {
		return S ^(1 << x);
	}
	
	public static int add(int S, int x) {
		return S | (1 << x);
	}
	
	public static int remove(int S, int x) {
		return S & ~(1 << x);
	}
	
	
	
	
	
	

	
	public static void out(int S) {
		System.out.println(Integer.toBinaryString(S));
	}
	
	private static void test02() {
		
		System.out.println(Integer.toBinaryString( 0  ));
		
		System.out.println(Integer.toBinaryString(  (1 << 10) ));
		System.out.println(Integer.toBinaryString(  (1 << 10)-1 ));
		
		System.out.println();
		
		
		
	}

	private static void test01() {
		int x = 10; // 2진수로 변환시 1010
	    int y = 12; // 2진수로 변환시 1100
	    
	    
	    System.out.println("y = \t" + Integer.toBinaryString(y));
	    System.out.println("x|y = \t" + Integer.toBinaryString(x|y));
	    System.out.println("x&y = \t" + Integer.toBinaryString(x&y));
	    System.out.println("x^y = \t" + Integer.toBinaryString(x^y));
	    System.out.println("~x = \t" + Integer.toBinaryString(~x));  // int는 4byte = 32bit이기때문에 앞에 28개의 1이 출력됨
	}

	
	
	
	
	
	
}
