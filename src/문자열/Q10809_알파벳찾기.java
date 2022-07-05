package 문자열;

import java.io.*;

public class Q10809_알파벳찾기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=97; i <= 122; i++) {
			char ch = (char)i;
			
			boolean bb = true;
			for(int p=0; p < S.length(); p++) {
				char pp = S.charAt(p);
				
				if(ch == pp) {
					bb = false;
					bw.write(p + "");
					break;
				}
			}
			
			if(bb) {
				bw.write(-1+"");
			}
			
			if(i != 122) bw.write(" ");
			
		}
		
		bw.flush();
	}
	
	
	
	
	
	
	
	
}
