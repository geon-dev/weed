package 문자열;

import java.io.*;

public class TEST_INPUT {


	
	public static void main(String[] args) throws Exception {
		
		String S = input();
		
		System.out.println(S);
		
	}
	
	
	
	static String input() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		String S = br.readLine();
//		String S = "test";
		
		return S;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
