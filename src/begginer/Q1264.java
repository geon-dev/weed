package begginer;

import java.io.*;

public class Q1264 {

	//https://www.acmicpc.net/problem/1264
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자
		
		//모음의 갯수
		// 줄마다
		// end 조건 #
		
		String S = "";
		while(!(S = br.readLine()).equals("#")) {
			S = S.toLowerCase();
			char[] cc = S.toCharArray();
			int cnt = 0;
			for(int i=0; i < cc.length; i++) {
				if(cc[i] == 'a' || cc[i] == 'e' 
						|| cc[i] == 'i' || cc[i] == 'o' || cc[i] == 'u' ) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	
	
	
	
	
	
	
}
