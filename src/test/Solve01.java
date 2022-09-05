package test;

public class Solve01 {

	public static void main(String[] args) {
		
		// 숫자로만 돼있는지
		
		String s1 = "a234";
		String s2 = "1234";
		
		System.out.println(solution("1111"));
		
		
	}

    static boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6) {
        	return false;
        }
        
        // 48 ~ 57
        for(int i=0; i < s.length(); i++) {
        	int v = (int)s.charAt(i);
        	System.out.print(v + " ");
        	
        	if(!(v >= 48 && v <= 57)) {
        		answer = false;
        	}
        }
        
        
        
        
        return answer;
    }
    
}
