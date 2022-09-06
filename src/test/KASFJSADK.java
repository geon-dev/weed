package test;

public class KASFJSADK {

	public static void main(String[] args) {
/*

[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	6
		
 */
		int[] arr1 = {1,2,3,4,6,7,8,0};
		System.out.println(solution(arr1));
	}
	

    static int solution(int[] numbers) {
        int answer = 0;
        
        // 배열 0 선언
        int[] check = new int[10];
        
        for(int i=0; i < numbers.length; i++) {
        	check[numbers[i]]++;
        }
        
        for(int i=0; i < check.length; i++) {
        	if(check[i] == 0) {
        		System.out.println(i);
        		answer += i;
        	}
        }
        
        
        return answer;
    }
    
    
    
    
    
    
    
    
    
    
	
}
