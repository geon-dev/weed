package test;

import java.util.*;

public class KAJSDFKAJSF {
	
	public static void main(String[] args) {
/*
5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
4	[4,4,4,4,4]	[4,1,2,3]
 */
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		solution(N, stages);
		
	}
	

    static int[] solution(int N, int[] stages) {
        
        
        // 멈춘사람 / 전체도전
        System.out.println("참여자=" + stages.length);
        
        int[] arr1 = new int[N+2];
        int[] arr2 = new int[N+2];
        // 해당문제 도전자
        for(int i=0; i < stages.length; i++) {
        	for(int p=0; p < stages[i]; p++) {
        		// 0..1
        		arr1[p+1]++;
        	}
        	
        	arr2[stages[i]]++;
        }
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        //[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
        Map<String, Double> mm = new HashMap<>();
        for(int i=1; i < arr1.length-1; i++) {
        	mm.put(i+"", arr2[i]/(double)arr1[i]);
        }
        
        System.out.println(mm);
        
        List<String> keySet = new ArrayList<>(mm.keySet());
        keySet.sort(new Comparator<String>() {
        	public int compare(String o1, String o2) {
        		return mm.get(o2).compareTo(mm.get(o1));
        	}
        });
        
        int[] answer = new int[N];
        for(int i=0; i < N; i++) {
        	answer[i] = Integer.valueOf(keySet.get(i));
        }
        
        return answer;
    }
    
    
    
    
    
}
