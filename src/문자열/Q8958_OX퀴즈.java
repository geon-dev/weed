package 문자열;

import java.io.*;

public class Q8958_OX퀴즈 {

	public static void main(String[] args) throws Exception {
	
		//https://www.acmicpc.net/problem/8958
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//문제 까지의 O가 점수
		
		int M = Integer.parseInt(br.readLine());
		
		for(int q=0; q < M; q++) {
			String s1 = br.readLine();

			// 맞았나 // 점수
			int all = 0;
			
			for(int i=0; i < s1.length(); i++) {
				if(s1.charAt(i) == 'O') {
					int v = i;
					int sum = 1;
					
					while(v > 0) {
						v--;
						
						if(s1.charAt(i) != s1.charAt(v)) {
							break;
						}else {
							sum++;
						}
					}
					all += sum;
				}
			}

			System.out.println(all);
		}
		
	}
	
	
	
	
	
}
