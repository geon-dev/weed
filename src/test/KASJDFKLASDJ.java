package test;

import java.util.*;

public class KASJDFKLASDJ {

	public static void main(String[] args) {
		
/*
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]		
 */
		//1, 2, 3, 4, 5
		//2, 1, 2, 3, 2, 4, 2, 5
		//3, 3, 1, 1, 2, 2, 4, 4, 5, 5
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,3,2,4,2};
		solution(arr2);
		
	}
	

    static int[] solution(int[] answers) {
        // 1~3수포자 맞은갯수
        // 8개
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i < answers.length; i++) {
        	int check1 = arr1[i%5];
        	int check2 = arr2[i%8];
        	int check3 = arr3[i%10];
        	
        	int v = answers[i];
        	System.out.print("v=" + v + " ");
        	System.out.print(check1);
        	System.out.print("/");
        	System.out.print(check2);
        	System.out.print("/");
        	System.out.print(check3);
        	System.out.println();
        	
        	if(v == check1) cnt1++;
        	if(v == check2) cnt2++;
        	if(v == check3) cnt3++;
        }
        
        System.out.print(cnt1);
        System.out.print("/");
        System.out.print(cnt2);
        System.out.print("/");
        System.out.print(cnt3);
        System.out.println();
        
        // 큰애별로
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        System.out.println(max);
        List<Integer> ll = new ArrayList<>();
        if(max == cnt1) {
        	ll.add(1);
        }
        if(max == cnt2) {
        	ll.add(2);
        }
        if(max == cnt3) {
        	ll.add(3);
        }
        
//        System.out.println(ll);
        
        int[] answer = new int[ll.size()];
        for(int i=0; i < answer.length; i++) {
        	answer[i] = ll.get(i);
        }
        
        int[] test = ll.stream().mapToInt(i->i.intValue()).toArray();

        System.out.println(Arrays.toString(test));
        
        return answer;
    }
	
	
	
}
