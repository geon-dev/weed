package 문자열;

import java.io.*;

public class Q10820_문자열분석 {

	//https://www.acmicpc.net/problem/10820
	
	/*
	 * 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
		각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다
		
		소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력
		

	 */
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = "";
		
		while((S = br.readLine()) != null) {
			int countA = 0;
			int countB = 0;
			int countC = 0;
			int countD = 0;
			
			for(int i=0; i < S.length(); i++) {
				char c = S.charAt(i);
				
				if(c >= 'a' && c <= 'z') {
					countA++;
				}
				
				if(c >= 'A' && c <= 'Z') {
					countB++;
				}
				
				if(c >= '0' && c <= '9') {
					countC++;
				}
				if(c == ' ') {
					countD++;
				}
			}
			
			System.out.println(countA + " " + countB + " " + countC + " " + countD);
		}
	}

	
	
	
	
	
	
}
