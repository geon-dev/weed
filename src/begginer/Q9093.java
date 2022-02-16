package begginer;

import java.util.*;

/*
 * https://www.acmicpc.net/problem/9093
 * 
 * 단어 뒤집기
 * 
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 */
public class Q9093 {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.nextLine();
		
		Stack<Character> st = new Stack<Character>();
		
		while(X-- > 0) {
			StringBuilder sb = new StringBuilder();
			String str = sc.nextLine()+" ";
			
			for(int i=0; i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					while(!st.isEmpty()) {
						sb.append(st.pop());
					}
					sb.append(" ");
				}else {
					st.push(str.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}
		
		sc.close();
		
	}

	public static void main2(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		int size = in.nextInt();
		in.nextLine();
		
		java.util.List<String> list = new java.util.ArrayList<String>();
		
		for(int i=0; i < size; i++) {
			list.add(in.nextLine());
		}
		
		for (String ss : list) {
			String[] split = split(ss);
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < split.length; i++) {
				sb.append(reverse(split[i]));
				sb.append(" ");
			}
			
			System.out.println(sb);
		}		
	}
	
	public static String[] split(String str) {
		String[] splitStr = str.split(" ");
		return splitStr;
	}
	
	public static String reverse(String inputStr) {
		StringBuilder sb = new StringBuilder();
		
		for(int z = inputStr.length()-1; z >= 0; z--) {
			sb.append(inputStr.charAt(z));
		}
		
		return sb.toString();
	}
	
	
}
