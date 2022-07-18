package 정렬;

import java.util.*;

public class Q6996_에너그램 {

	//https://www.acmicpc.net/problem/6996

	// TODO : 문자열 배열으로 풀기
	// https://hyunjiishailey.tistory.com/447
	
    private static boolean solveAnagrams(String first, String second ) {
		String s1 = first;
		String s2 = second;
		
		char[] cc1 = new char[s1.length()];
		for(int i=0; i < s1.length(); i++) {
			cc1[i] = s1.toCharArray()[i];
		}
		
		char[] cc2 = new char[s2.length()];
		for(int p=0; p < s2.length(); p++) {
			cc2[p] = s2.toCharArray()[p];
		}

		for(int i=0; i < s1.length(); i++) {
			for(int p=0; p < s2.length(); p++) {
				char c1 = cc1[i];
				char c2 = cc2[p];
				
				if(c1 == c2) {
					cc1[i] = ' ';
					cc2[p] = ' ';
				}
			}
		}
		
		boolean checkCC1 = false;
		for(char c : cc1) {
			if(c != ' ') {
				checkCC1 = true;
			}
		}
		
		boolean checkCC2 = false;
		for(char c : cc2) {
			if(c != ' ') {
				checkCC2 = true;
			}
		}
		
		if(checkCC1 || checkCC2) {
			return false;
		}else {
			return true;
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
    
	
	
	
	
	
	
	
}
