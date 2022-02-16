package begginer;

import java.io.*;
import java.util.*;

/*
 * https://www.acmicpc.net/problem/1406
 * 
 * 자료구조 - 스택
 * 
 * 에디터
 * 
 * 한 줄로 된 간단한 에디터를 구현
 */
public class Q1406 {
	/*
	15:53 >> 17:00 >> 시간초과
	
	입력
	abcd
	3
	P x
	L
	P y

	출력 : abcdyx
	 */
	
	//https://minhamina.tistory.com/17
	//다시
	//스택 이용해서
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int M = Integer.parseInt(br.readLine()); // 명령어 갯수
		
		Stack<Character> st = new Stack<Character>();
		
		for(char cc : s.toCharArray()) {
			st.push(cc);
		}
		
		int cursor = st.size();
		
		// M 반복
		for(int i=0; i < M; i++) {
			String command = br.readLine();
			
			if (command.equals("L")) {
				// 맨왼쪽일 경우 무시됨
				if(cursor > 0) cursor--;
				
			}else if(command.equals("D")) {
				// 맨오른쪽일 경우 무시됨
				if(st.size() > cursor) cursor++;
				
			}else if(command.equals("B")) {
				// 맨앞이면 무시
				if(cursor > 0) {
					st.remove(cursor-1);
					cursor--;
				}
			}else if(command.contains("P")) {
				// 커서 왼쪽에 추가
				st.add(cursor, getStr(command).charAt(0));
				cursor++;
			}
			
		}
		
		StringBuilder ssbb = new StringBuilder();
		for(Character ss : st) {
			ssbb.append(ss);
		}
		System.out.println(ssbb);
		
	}
	
	static String getStr(String command) {
		return command.split(" ")[1];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
