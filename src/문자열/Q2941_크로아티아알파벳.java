package 문자열;

import java.io.*;
import java.util.*;

public class Q2941_크로아티아알파벳 {

	//https://www.acmicpc.net/problem/2941
	public static void main(String[] args) {
		String[] check = {"c=","c-","dz=","d-"
				,"lj","nj","s=","z="};
		
		String S = new Scanner(System.in).nextLine();
		
		for(int i=0; i < check.length; i++) {
			if(S.indexOf(check[i]) > -1) {
				S = S.replace(check[i], "@");
			}
		}
		
		System.out.println(S.length());
	}
	
	
}
