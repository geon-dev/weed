package 문자열;

import java.util.*;
import java.io.*;

public class Q10174 {

	//https://www.acmicpc.net/problem/10174
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int p=0; p < n; p++) {
			String S = br.readLine();
			S = S.toLowerCase();
			
			String revers = "";
			for(int i=S.length()-1; i >= 0; i--) {
				char c = S.toCharArray()[i];
				revers += c;
			}
			
			boolean check = false;
			for(int i=0; i < S.length(); i++) {
				char c = S.toCharArray()[i];
				char v = revers.toCharArray()[i];
				
				if(c != v) check = true;
			}
			
			if(check) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		
		
	}
	
	
	
	
	
}
