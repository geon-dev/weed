package begginer;

import java.util.*;

public class Q2525 {
	
	//https://www.acmicpc.net/problem/2525
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		M = M + C;
		
		while(M >= 60) {
			M = M - 60;
			H++;
		}
		
		if(H >= 24) {
			H = H - 24;
		}
		
		System.out.println(H + " " + M);
		
	}
	
	
	
	
	
	
	
	

}
