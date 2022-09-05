package test;

import java.util.*;

public class ASdflk {

	public static void main(String[] args) {
	
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		solution(arr2);
	}
	
/*
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
 */
	
    static int[] solution(int []arr) {
        // 1000000 범위
        // 연속적인 숫자를 한개로

        // 이전 수와 같지않으면 insert
        List<Integer> ll = new ArrayList<>();
        if(arr.length > 0) {
        	ll.add(arr[0]);
        }
        
        for(int i=1; i < arr.length; i++) {
        	int v1 = arr[i-1];
        	int v2 = arr[i];
        	
        	if(v1 != v2) {
        		ll.add(v2);
        	}
        }
      
        int[] answer = new int[ll.size()];
        for(int i=0; i < ll.size(); i++) {
        	answer[i] = ll.get(i);
        }

        return answer;
    }
}
