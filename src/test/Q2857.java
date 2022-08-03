package test;

import java.util.*;
import java.io.*;

public class Q2857 {

	//https://www.acmicpc.net/problem/2857
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		
		for(int i=0; i < 5; i++) {
			String S = br.readLine();
			
			if(S.indexOf("FBI") > -1) {
				result += (i+1) + " ";
			}
		}
		
		if("".equals(result)) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(result);
		}
	}
	
	
	
	
}
