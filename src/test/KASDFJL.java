package test;

public class KASDFJL {

	public static void main(String[] args) {
/*
[4,7,12]	[true,false,true]	9
[1,2,3]	[false,false,true]	0		
 */
		int[] arr1 = {4,7,12};
		boolean[] signs1 = {true,false,true};
		
		solution(arr1, signs1);
	}
	

    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i < absolutes.length; i++) {
        	if(signs[i]) {
        		answer += absolutes[i];
        	}else {
        		answer -= absolutes[i];
        	}
        }

        System.out.println(answer);
        
        
        
        
        
        return answer;
    }
    
    
    
    
    
    
    
    
    
	
}
