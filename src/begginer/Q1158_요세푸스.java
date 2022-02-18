package begginer;

import java.util.*;
import java.io.*;

public class Q1158_요세푸스 {
	/*
	 * URL : https://www.acmicpc.net/problem/1158
	 * 제목 : 조세푸스, 요세푸스
	 * 
	 * 시간 : 16:50 > 17:32 틀림 >> 17:40
	 * 
	 * 비고 : 1168번 요세푸스 문제 비슷한문제
	 * 
	 * 추후 : 출력 무조건 같게하기
	 * 추후 : 좀더 간단히 바꾸기
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringTokenizer st = new StringTokenizer("7 3");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

//		System.out.println(N);
//		System.out.println(K);
		
		// 큐 선언
		Queue<Integer> qq = initQueue(N);
		
		// 반복
		Queue<Integer> result = process(qq, K);
		
//		System.out.println(result);
		
		// 출력
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int size = result.size();
		for(int i = 0; i < size; i++) {
			
			if(result.size() == 1) {
				sb.append(result.poll() + ">");
			}else {
				sb.append(result.poll() + ", ");
			}
		}
		
		System.out.println(sb);
		
	}

	private static Queue<Integer> initQueue(int n) {
		Queue<Integer> qq = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			qq.add(i+1);
		}
		
		return qq;
	}

	private static Queue<Integer> process(Queue<Integer> qq, int K) {
		Queue<Integer> result = new LinkedList<>(); 
		
		while(qq.size() > 0) {
			for(int i=0; i < K; i++) {
				int value = qq.poll();
				
				if(i == K-1) {
					result.add(value);
				}else {
					qq.add(value);
				}
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
