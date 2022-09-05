package test;

public class B129830 {

	public static void main(String[] args) {
		
		//["Jane", "Kim"]	"김서방은 1에 있다"
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	

    static String solution(String[] seoul) {
        String answer = "김서방은 ";
        
        int index = 0;
        for(int i=0; i < seoul.length; i++) {
        	String s = seoul[i];
        	
        	if("Kim".equals(s)) {
        		index = i;
        		break;
        	}
        }
        
        answer += index;
        answer += "에 있다";
        
        return answer;
    }
    
}
