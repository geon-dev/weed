package 문자열;

import java.util.*;
import java.io.*;

public class Q1316_그룹단어체크 {

	// https://www.acmicpc.net/problem/1316
	
	// 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int p=0; p < M; p++) {
			String S1 = br.readLine();
			
//			System.out.println("==================================================");
			
			int[] arr = new int[26];
			char[] c = new char[100];
			
			c[0] = S1.charAt(0);
			arr[(int)c[0]-97] = 1;
			for(int i=1; i < S1.length(); i++) {
				c[i] = S1.charAt(i);
				
				arr = process(arr, c[i-1], c[i]);
				if(arr == null) break;
			}
			
//			System.out.println("완료");
//			System.out.println(Arrays.toString(arr));
			if(arr != null) {
//				System.out.println("그룹단어");
				count++;
			}else {
//				System.out.println("그룹단어 X");
			}
			
//			System.out.println("==================================================");
		}
		
		System.out.println(count);
	}
	
	static int[] process(int[] arr, char s1, char s2) {
//		System.out.println(s1 + "/" + arr[(int)s1-97] + "    " + s2 + "/" + arr[(int)s2-97]);
		
		//전 char와 같거나
		if(s1 == s2) {
//			System.out.println("전 char와 같음 >> 패스");
		}else {
			//arr에 없어야함
			if(arr[(int)s2-97] != 1) {
//				System.out.println("arr에 없음 >> 입력하기");
				arr[(int)s2-97] = 1;
			}else {
//				System.out.println("arr에 있음 >> ㄴㄴ");
				arr = null;
			}
		}
		
		return arr;
	}
	
	
	
	
	
	
}
