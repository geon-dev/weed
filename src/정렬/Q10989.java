package 정렬;

import java.util.*;
import java.io.*;

public class Q10989 {

	//https://www.acmicpc.net/problem/10989
	//수 정렬하기
	
	//N(1 ≤ N ≤ 10,000,000)
	// 10,000 보다 작은수
	
	// TODO : 카운팅 정렬로 // https://st-lab.tistory.com/107
	
	public static void main(String[] args) throws Exception {
		long beforetime = System.currentTimeMillis();
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 100000;
		int[] arr = new int[N];
        
		for(int i=0; i < N; i++) {
        	int rr = (int)(Math.random()*10000);
        	arr[i] = rr;
        }
        
		// 오름차순
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int v : arr) {
//			sb.append(v);
//			sb.append("\n");
			bw.write(v + "\n");
		}
		
		bw.flush();
		bw.close();
		
//		System.out.println(sb.toString());
		
		long aftertime = System.currentTimeMillis();
		long sec = (aftertime - beforetime) / 1000;
		System.out.println("시간=" + sec);
	}
	
	
	
	
	
	
	
	
	
	
	
}
