package begginer;

import java.util.*;

public class Q1259 {

	
	//https://www.acmicpc.net/problem/1259
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String S = sc.nextLine();
			if("0".equals(S)) return;
			
			char[] c1 = S.toCharArray();
			
			char[] c2 = new char[c1.length];
			int index = 0;
			for(int i=c1.length-1; i >=0; i--) {
				c2[index++] = c1[i];
			}
			
			boolean check = false;
			for(int i=0; i < c1.length; i++) {
				if(c1[i] != c2[i]) check = true;
			}
			
			if(check) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
		}
		
	}
	
	
}
