package test;

import java.util.*;

public class ASDFKJ {

	public static void main(String[] args) {

//		int[] lottos = {44, 1, 0, 0, 31, 25};
//		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
//		int[] lottos = {0, 0, 0, 0, 0, 0};
//		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
//		int[] lottos = {21, 10, 4, 44, 5, 34};
//		int[] lottos = {0, 10, 4, 44, 5, 34};
//		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
/*
[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
		
 */
		
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
		
	}
	
    static int[] solution(int[] lottos, int[] win_nums) {
        // 비교 후 있는 것들만
        // lottos >> win_nums
        // 0 이 몇개
        int zero = 0;
        int win = 0;
        for(int i=0; i < lottos.length; i++) {
        	int v = lottos[i];
        	if(v == 0) {
        		zero++;
        		continue;
        	}
        	
        	for(int p=0; p < win_nums.length; p++) {
        		int w = win_nums[p];
        		
        		if(v == w) {
//        			System.out.println(v + " 당첨번호 ");
        			win++;
        		}else {
        			
        		}
        	}
        }
        
//        System.out.println("win=" + win);
//        System.out.println("zero=" + zero);
        
        
        int[] answer = {lank(win+zero), lank(win)};
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
    static int lank(int v) {
    	if(v == 6) {
    		return 1;
    	}else if(v == 5) {
    		return 2;
    	}else if(v == 4) {
    		return 3;
    	}else if(v == 3) {
    		return 4;
    	}else if(v == 2) {
    		return 5;
    	}else {
    		return 6;
    	}
    }    	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
