package test;

public class ALSDFWE {

	public static void main(String[] args) {
		
		//"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
//		String s = "...!@BaT#*..y.abcdefghijklm";
//		String s = "=.=";
//		String s = "123_.def";
		String s = "abcdefghijklmn.p";
		
/*
예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
예2	"z-+.^."	"z--"
예3	"=.="	"aaa"
예4	"123_.def"	"123_.def"
예5	"abcdefghijklmn.p"	"abcdefghijklmn"		
 */
		System.out.println(solution(s));
		
//		String test = ".";
//		System.out.println(test.indexOf("."));
//		System.out.println(test.substring(0, 0));
		
		//s4.indexOf(".") == 0 || (s4.indexOf(".") == s4.length()-1)
//		System.out.println(test.substring(1));
//		test = "1234";
		
		
	}
	
	
    static String solution(String new_id) {
        String answer = "";
        
        String s1 = new_id.toLowerCase();
//        System.out.println("s1=" + s1);

        String s2 = "";
        for(int i=0; i < s1.length(); i++) {
        	char c = s1.charAt(i);
        	
        	if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') 
        			|| c == '-' || c == '_' || c == '.') {
        		s2 += c;
        	}
        }
        
//        System.out.println("s2=" + s2);
        
        String s3 = s2;
        boolean check3 = false;
        while(!check3) {
        	s3 = s3.replace("..", ".");
        	
        	if(!s3.contains("..")) {
        		check3 = true;
        	}
        }
        
//        System.out.println("s3=" + s3);
        
        String s4 = s3;
        boolean check4 = false;
        while(!check4) {
        	if(s4.indexOf(".") == 0) {
        		s4 = s4.substring(1);
        	}else if(s4.indexOf(".") == s4.length()-1) {
        		s4 = s4.substring(0, s4.length()-1);
        	}
        	
        	if(s4.indexOf(".") < 0 || !(s4.indexOf(".") == 0 || (s4.indexOf(".") == s4.length()-1))) {
        		check4 = true;
        	}
        }
        
//        System.out.println("s4=" + s4);
        
        String s5 = s4;
        if("".equals(s5)) {
        	s5 = "a";
        }
//        System.out.println("s5=" + s5);
/*
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 
나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 
     문자를 제거합니다.        
 */
        String s6 = s5;
        if(s6.length() > 15) {
        	s6 = s6.substring(0, 15);
        }
        if(s6.lastIndexOf(".") == s6.length()-1) {
        	s6 = s6.substring(0, s6.length()-1);
        }
//        System.out.println("s6=" + s6);
        
        String s7 = s6;
        if(s7.length() <= 2) {
        	for(int i=s7.length(); i < 3; i++) {
        		s7 += s7.charAt(s7.length()-1);
        	}
        }
//        System.out.println("s7=" + s7);
        answer = s7;
        return answer;
    }
    
    
    
    
    
    
    
    
    
}
