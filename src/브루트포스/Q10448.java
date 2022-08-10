package 브루트포스;

import java.util.*;

public class Q10448 {

	//https://www.acmicpc.net/problem/10448
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while(T-- > 0) {
			int K = sc.nextInt();
			boolean ss = false;
			
			for(int i=1; i < 45; i++) {
				if(ss) break;
				for(int p=1; p < 45; p++) {
					if(ss) break;
					for(int q=1; q < 45; q++) {
						if(ss) break;
						
						int v1 = i*(i+1)/2;
						int v2 = p*(p+1)/2;
						int v3 = q*(q+1)/2;
						
						int sum = v1+v2+v3;
						if(K == sum) {
							ss = true;
						}
					}
				}
			}
			
			if(ss) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
}
