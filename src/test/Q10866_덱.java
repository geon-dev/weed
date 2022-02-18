package test;

import java.util.*;
import java.io.*;

public class Q10866_덱 {
	/*
	 * URL : https://www.acmicpc.net/problem/10866
	 * 제목 : 덱
	 * 
	 * 시간1 : 14:00 > 14:34
	 * 시간2 : 14:54 > 15:00
	 * 
	 * 비고 :
	 * 
	 * 추후 : Deque 이용
	 * 
	 */
	
	public static void main(String[] args) throws Exception{
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//구조 선언
		List<Integer> qq = new LinkedList<>(); 
		
		//출력
		StringBuilder sb = new StringBuilder();
		
		while(N-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			//프로세스
			switch(command) {
				case "push_front" : 
						qq.add(0, Integer.parseInt(st.nextToken()));
				break;
				case "push_back" : 
					qq.add(Integer.parseInt(st.nextToken()));
				break;
				case "pop_front" :
					if(qq.size() > 0) {
						sb.append(qq.get(0)).append("\n");
						qq.remove(0);
					}else {
						sb.append("-1").append("\n");
					}
				break;
				case "pop_back" : 
					if(qq.size() > 0) {
						sb.append(qq.get(qq.size()-1)).append("\n");
						qq.remove(qq.size()-1);
					}else {
						sb.append("-1").append("\n");
					}
				break;
				case "size" : 
					sb.append(qq.size()).append("\n");
				break;
				case "empty" : 
					if(qq.isEmpty()) {
						sb.append("1").append("\n");
					}else {
						sb.append("0").append("\n");
					}
				break;
				case "front" : 
					if(qq.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(qq.get(0)).append("\n");
					}
				break;
				case "back" : 
					if(qq.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(qq.get(qq.size()-1)).append("\n");
					}
				break;
			}
		}
		
		sb.deleteCharAt(sb.lastIndexOf("\n"));
		System.out.println(sb);
	}
	
	
}
