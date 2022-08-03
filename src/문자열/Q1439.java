package 문자열;

public class Q1439 {

	//https://www.acmicpc.net/problem/1439
	
	public static void main(String[] args) {
		String S = new java.util.Scanner(System.in).nextLine();

		// 0 > 1 > 0 > 1
		// 바뀌면 +1
		char check = ' ';
		int cnt = 0;
		for(int i=0; i < S.length(); i++) {
			char c = S.toCharArray()[i];
			
			if(check != c) {
				check = c;
				cnt++;
			}
		}
		
		// 변환
		System.out.println(cnt/2);
		
		
		
		
	}
	
	
	
	
	
	
}
