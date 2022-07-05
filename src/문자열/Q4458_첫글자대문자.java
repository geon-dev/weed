package 문자열;

import java.util.*;
import java.io.*;

public class Q4458_첫글자대문자 {

	// https://www.acmicpc.net/problem/4458
	
/*

5
powdered Toast Man
skeletor
Electra Woman and Dyna Girl
she-Ra Princess of Power
darth Vader
	
 */
// 각 줄의 첫글자를 대문자로
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
//		String[] ss = S.split(System.lineSeparator());

		for(int i=0; i < M; i++) {
			String temp = br.readLine();
			String sss = temp.substring(0, 1).toUpperCase() + temp.substring(1);
			
			System.out.println(sss);
		}
		
		// (str.charAt(0) + "")
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
