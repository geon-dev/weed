package test;

public class AKSDFJ {

	public static void main(String[] args) {
	
/*
[1,2,3,4]	[-3,-1,0,2]	3
[-1,0,1]	[1,0,-1]	-2		
 */
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		solution(a, b);
		
	}
	

    static int solution(int[] a, int[] b) {
        int answer = 0;

        // a*b + ~~
        for(int i=0; i < a.length; i++) {
//        	System.out.println(i);
        	answer += (a[i]*b[i]);
        }
        
        System.out.println(answer);
        
        
        return answer;
    }
	
	
	
	
	
}


