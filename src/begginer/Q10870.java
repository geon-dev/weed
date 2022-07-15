package begginer;

import java.util.*;

public class Q10870 {

	//https://www.acmicpc.net/problem/10870
	
	public static void main(String[] args) {
		// F0 = 0 // F1 = 1
		// Fn = Fn-1 + Fn-2 (n ≥ 2)
		
		int input = new Scanner(System.in).nextInt();
		
		System.out.println(fnc(input, 0));
	}

	private static int fnc(int input, int depth) {
		//탈출
		if(input == 0) {
			return 0;
		}else if(input == 1) {
			return 1;
		}
		
		//proc
		return fnc(input-1, depth+1) + fnc(input-2, depth+1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
