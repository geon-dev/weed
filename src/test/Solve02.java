package test;

public class Solve02 {

	public static void main(String[] args) {
		
		// 숫자로만 돼있는지
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String result = "LRLLLRLLRRL";
		
		System.out.println("LRLLLRLLRRL");
		System.out.println(solution(numbers, hand));
		
		String s = "5";
		
		// 왼손 위치, 오른손 위치
		// 1,1 > 2,2
		String left = "11";
		String right = "31";
		
		// 해당 숫자까지 거리
		// 2 5 8 0
		
//		System.out.println(distance(left, s));
//		System.out.println(distance(right, s));
	}
	
	static int distance(String hand, String s) {
		String check = "";
		if("2".equals(s)) {
			check = "4";
		}else if("5".equals(s)) {
			check = "3";
		}else if("8".equals(s)) {
			check = "2";
		}else if("0".equals(s)) {
			check = "1";
		}
		
		String[] ll = hand.split("");
		int leftD = Math.abs(2 - Integer.parseInt(ll[0]));
		leftD += Math.abs(Integer.parseInt(check) - Integer.parseInt(ll[1]));

		return leftD;
	}
	

    static String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 위치
		String left = "11";
		String right = "31";
		
        for(int i=0; i < numbers.length; i++) {
        	String s = String.valueOf(numbers[i]);
//        	System.out.print("left=" + left + "/right="+right + ">>");
//        	System.out.print("입력 = " + s + " ");
        	
        	if("1".equals(s)) {
        		answer += "L";
        		left = "14";
        	}else if("4".equals(s)) {
        		answer += "L";
        		left = "13";
        	}else if("7".equals(s)) {
        		answer += "L";
        		left = "12";
        	}else if("3".equals(s)) {
        		answer += "R";
        		right = "34";
        	}else if("6".equals(s)) {
        		answer += "R";
        		right = "33";
        	}else if("9".equals(s)) {
        		answer += "R";
        		right = "32";
        	}else {
//        		System.out.print(left + " / " + right + " = ");
//        		
//        		System.out.print(s + " ");
//        		System.out.print(distance(left, s));
//        		System.out.print(" ");
//        		System.out.print(distance(right, s));
//        		System.out.println();
        		
        		int leftD = distance(left, s);
        		int rightD = distance(right, s);
        		
        		if(leftD < rightD) {
        			answer += "L";
        			left = SET2580(s);
        		}else if(leftD > rightD) {
        			answer += "R";
        			right = SET2580(s);
        		}else {
        			if("left".equals(hand)) {
            			answer += "L";
            			left = SET2580(s);
        			}else {
            			answer += "R";
            			right = SET2580(s);
        			}
        		}
        	}
        	
//        	System.out.print("// left=" + left + "/right="+right + " ");
//        	System.out.println("/answer = " + answer);
        }
        
        return answer;
    }
    

    static String SET2580(String s) {
    	String position = "";
    	
    	if("2".equals(s)) {
    		position = "24";
    	}else if("5".equals(s)) {
    		position = "23";
    	}else if("8".equals(s)) {
    		position = "22";
    	}else if("0".equals(s)) {
    		position = "21";
    	}    	
    	
    	return position;
    }
    
    
    
    
    
    
    
}
