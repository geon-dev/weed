package test;

import java.util.*;

public class Q5613 {

	// https://www.acmicpc.net/problem/5613
/*
1
+
1
=	
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			String key = sc.nextLine();
			if("=".equals(key) || key.indexOf("=") > -1) {
				System.out.println(result);
				return;
			}

			String s = sc.nextLine();
			int v = Integer.parseInt(s);
			
			switch(key) {
				case "+" : result = result + v;
					break;
				case "-" : result = result - v;
					break;
				case "*" : result = result * v;
					break;
				case "/" : result = result / v;
					break;
			}
		}
	}
	
	
	
	
	
}
