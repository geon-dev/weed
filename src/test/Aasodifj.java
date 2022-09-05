package test;

public class Aasodifj {

	public static void main(String[] args) {
		
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		System.out.println(solution(sizes));
	}

	// {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}
	// >> 120

    static int solution(int[][] sizes) {
        int answer = 0;
        int w_max = 0;
        int h_max = 0;
        
        for(int i=0; i < sizes.length; i++) {
        	int v1 = sizes[i][0];
        	int v2 = sizes[i][1];
        	
        	// 한쪽으로 큰값 몰아서
        	if(v2 > v1) {
        		v1 = sizes[i][1];
        		v2 = sizes[i][0];
        	}
        	
//        	System.out.println(v1 + "/" + v2);
        	if(v1 > w_max) {
        		w_max = v1;
        	}
        	
        	if(v2 > h_max) {
        		h_max = v2;
        	}
        }
        
        answer = w_max * h_max;
        
        return answer;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
