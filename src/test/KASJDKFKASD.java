package test;

import java.util.*;

public class KASJDKFKASD {

	public static void main(String[] args) {
	
		
/*
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	4
3	[3]	[1]	2		
 */
		/*
		int n = 5; // 전체학생
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		*/
		
		int n = 3; // 전체학생
		int[] lost = {3};
		int[] reserve = {1};
		
		solution(n, lost, reserve);
		
	}
	

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 여벌있는 학생도 뺏길 수 있음
        int[] arr = new int[n+2];
        for(int i=0; i < arr.length; i++) {
        	arr[i] = 1;
        }
        
        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i < lost.length; i++) {
        	arr[lost[i]]--;
        }
        
        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i < reserve.length; i++) {
        	arr[reserve[i]]++;
        }
        
        System.out.println(Arrays.toString(arr));
        
        // 0인 index의 앞에 있다/ 뒤에있다 >> --
        for(int i=1; i < arr.length; i++) {
        	System.out.print(arr[i]);
        	System.out.print(" ");
        	
        	if(arr[i] == 0) {
        		if(arr[i-1] > 1) {
        			System.out.print("앞꺼 가져오기");
        			arr[i]++;
        			arr[i-1]--;
        			System.out.print(" ");
        		}else if(arr[i+1] > 1) {
        			System.out.print("뒤꺼 가져오기");
        			arr[i]++;
        			arr[i+1]--;
        			System.out.print(" ");
        		}else {
        			System.out.print("가져올곳 없음");
        			System.out.print(" ");
        		}
        	}
        	
        	System.out.println();
        }
        
        System.out.println(Arrays.toString(arr));
        for(int i=1; i < arr.length-1; i++) {
//        	System.out.println(arr[i]);
        	if(arr[i] > 0) {
        		answer++;
        	}
        }

        System.out.println("answer=" + answer);
        
        return answer;
    }
    
    
    
    
	
	
}
