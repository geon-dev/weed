package test;

public class KSADF {
	
	public static void main(String[] args) {

		String s = "one4seveneight";
		String s1 = "23four5six7";
		String s2 = "2three45sixseven";
		String s3 = "123";
		
		solution(s);
		solution(s1);
		solution(s2);
		solution(s3);
	}

	

    static int solution(String s) {
        int answer = 0;
        
        System.out.println("input=" + s);
        
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        System.out.println(s);
        answer = Integer.valueOf(s);
        
        return answer;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
