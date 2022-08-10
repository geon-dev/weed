package 문자열;

import java.util.*;

public class Q4659 {

	//https://www.acmicpc.net/problem/4659
	
	public static void main(String[] args) {
		
/*


		
 */
		String s1 = "hkoocootuh";
		boolean nAccept = false;
		
		//1.모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
		boolean isA = false;
		for(int i=0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			
			if(모음(c)) {
				isA = true;
			}
		}
		System.out.println("isA=" + isA);
		
		//2.모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
		int cntB = 1;
		boolean isB = true;
		for(int i=0; i < s1.length(); i++) {
			char c = s1.charAt(i);

			if(i > 0) {
				//모음
				char c1 = s1.charAt(i-1);
				
				if(모음(c)) {
					if(모음(c1)) {
						cntB++;
					}else {
						cntB = 1;
					}
				}else {
					if(!모음(c1)) {
						cntB++;
					}else {
						cntB = 1;
					}
				}
			}
			
			if(cntB > 2) {
				System.out.println(cntB + "/" + c + "(" + i + ")");
				isB = false;
			}
		}
		System.out.println(isB);

		//3.같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
		int cntC = 1;
		for(int i=0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			
			
			
			
		}
		
		
		
		
		
	}
	
	static boolean 모음(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
