package test;

import java.util.*;

public class KASDJFASDJ {

	public static void main(String[] args) {
/*
[3,1,2,3]	2
[3,3,3,2,2,4]	3
[3,3,3,2,2,2]	2		
 */
		int[] arr = {3,1,2,3};
		int[] arr1 = {3,3,3,2,2,4};
		int[] arr2 = {3,3,3,2,2,2};
		
		solution(arr2);
		
		
	}
	

    static int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        // 종류 1 이상 200,000
        // set > contain?
        Set<Integer> st = new HashSet<>();
        for(int i=0; i < length ; i++) {
        	int v = nums[i];
        	
//        	System.out.println(v);
        	if(!st.contains(v)) {
        		st.add(v);
        	}
        }
        
        System.out.println(st.size());
        System.out.println(length);
        System.out.println(length/2);
        
        if(length/2 >= st.size()) {
        	answer = st.size();
        }else {
        	answer = length/2;
        }
        
        System.out.println("answer=" + answer);
        
        
        return answer;
    }
	
	
	
	
	
	
	
}
