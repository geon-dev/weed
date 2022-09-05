package test;

import java.util.*;

public class Bas9df8 {

	public static void main(String[] args) {
		
//"Zbcdefg"	"gfedcbZ"
		String s = "Zbcdefg";
		
		System.out.println(solution(s));
		
	}
	

    static String solution(String s) {
        String answer = "";
        
        // 대문자는 소문자 뒤로
        // 대문자 소문자 나누고
        // sort
        char[] cc = new char[s.length()];
        for(int i=0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
//        	System.out.println(c);
        	cc[i] = c;
        }
        
//        System.out.println(cc);
        Arrays.sort(cc);
//        System.out.println(cc);
        
        for(int i=cc.length-1; i >= 0; i--) {
        	answer += cc[i];
        }
        
        return answer;
    }
    
    
    
    
    
    
}
