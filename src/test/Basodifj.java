package test;

public class Basodifj {

	public static void main(String[] args) {
		
		String s = "1234";
		String s2 = "-1234";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
	}

	/*
예를들어 str이 "1234"이면 1234를 반환하고, 
"-1234"이면 -1234를 반환하면 됩니다. 
	 */

    static int solution(String s) {
        int answer = 0;
        
        answer = new Integer(s);
        
        return answer;
    }
    
}
