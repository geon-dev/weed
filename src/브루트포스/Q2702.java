package 브루트포스;

import java.util.*;

public class Q2702 {

	//https://www.acmicpc.net/problem/2702
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while(T-- > 0) {

			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			//최대 공배수
			//max갑부터 쭉
			int max = Math.max(v1, v2);
			int min = Math.min(v1, v2);
			
			while(true) {
				if(max%v1 == 0 && max%v2 == 0) {
					break;
				}else {
					max++;
				}
			}
			
			while(true) {
				if(v1%min == 0 && v2%min == 0) {
					break;
				}else {
					min--;
				}
			}
			
			System.out.println(max + " " + min);
			
		}
		
		
		
	}
	
	
	
	
	
}
