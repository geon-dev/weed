package 문자열;

import java.io.*;
import java.util.*;

public class Q1181_단어정렬 {

	//https://www.acmicpc.net/problem/1181
	/*

길이가 짧은 것부터
길이가 같으면 사전 순으로

주어지는 문자열의 길이는 50을 넘지 않는다.

단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		
		List<String> arr = new ArrayList<>();
		for(int i=0; i < M; i++) {
			arr.add(br.readLine());
		}
		
		// 길이 정렬
		Collections.sort(arr, (v1, v2) -> {
			if(v1.length() == v2.length()) {
				// 사전순 정렬
				return v1.compareTo(v2);
			}else {
				return v1.length() - v2.length();
			}
			
		});
		
		for(int i=1; i < arr.size(); i++) {
			if(arr.get(i-1).equals(arr.get(i))) {
				arr.remove(i--);
			}
		}
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main_X(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		
		// 중복 제거
		Set<String> set = new HashSet<>();
		for(int i=0; i < M; i++) {
			set.add(br.readLine());
		}
		
		
		List<String> list = new ArrayList<>();
		// 길이 순으로
		for(int i=1; i < 50; i++) {
			for(String v : set) {
				if(v.length() == i) {
					list.add(v);
				}
			}
		}
		
		int last = 0;
		for(int i=1; i < 50; i++) {
			
			int count = 0;
			for(String v : list) {
				if(v.length() == i) {
					count++;
					last++;
				}
			}
			
			String[] S = new String[count];
			int index = 0;
			for(String v : list) {
				if(v.length() == i) {
					S[index] = v;
					index++;
				}
			}
			
			Arrays.sort(S);
			
			for(String v : S) {
				if(list.size() == last) {
					sb.append(v);
				} else {
					sb.append(v + "\n");
				}
			}
			
			
		}
		
		System.out.println(sb);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
