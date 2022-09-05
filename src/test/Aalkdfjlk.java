package test;

import java.util.*;

public class Aalkdfjlk {

	/*
	["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	"TCMA"
	 */
	
	public static void main(String[] args) {
		
//		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//		int[] choices = {5, 3, 2, 7, 5};
		
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7, 1, 3};
		
		//["TR", "RT", "TR"]	[7, 1, 3]
				
		solution(survey, choices);
	}

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        
        // 전체 유형
        Map<String, Integer> mm = new HashMap<>();
        mm.put("R", 0);
        mm.put("T", 0);
        mm.put("C", 0);
        mm.put("F", 0);
        mm.put("J", 0);
        mm.put("M", 0);
        mm.put("A", 0);
        mm.put("N", 0);
        
        // split
        // 점수 쁠러쓰
        // 1 ~ 7
        // 1 2 3    4    5 6 7 
        // for
        for(int i=0; i < survey.length; i++) {
	        String s = survey[i];
	        int choice = choices[i];
	        
	        String s1 = s.split("")[0];
	        String s2 = s.split("")[1];
//	        System.out.println(s1 + "/" + s2);
	        
	        if(choice < 4) {
	        	int plus = 4 - choice;
	        	mm.put(s1, mm.get(s1) + plus);
	        }else if(choice > 4) {
	        	int plus = choice - 4;
	        	mm.put(s2, mm.get(s2) + plus);
	        }
        }
        
//        System.out.println(mm);
        
        // 비교
        //{A=1, R=0, C=1, T=3, F=0, J=0, M=2, N=1}
/*
1번 지표	라이언형(R), 튜브형(T)
2번 지표	콘형(C), 프로도형(F)
3번 지표	제이지형(J), 무지형(M)
4번 지표	어피치형(A), 네오형(N)
 */
        String[] arr = {"RT", "CF", "JM", "AN"};
        for(int i=0; i < arr.length; i++) {
        	String s1 = arr[i].split("")[0];
        	String s2 = arr[i].split("")[1];
        	
        	int v1 = mm.get(s1);
        	int v2 = mm.get(s2);
        	
        	if(v1 > v2) {
        		answer += s1;
        	}else if (v2 > v1) {
        		answer += s2;
        	}else {
        		if(s1.compareTo(s2) > 0) {
        			answer += s2;
        		}else {
        			answer += s1;
        		}
        	}
        }

        return answer;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
