package begginer;

import java.util.*;

public class Q14681 {

	//https://www.acmicpc.net/problem/14681
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		boolean b1 = false;
		boolean b2 = false;
		
		if(v1 > 0) b1 = true;
		if(v2 > 0) b2 = true;
		
		if(b1 && b2) {
			System.out.println(1);
		}else if(!b1 && b2) {
			System.out.println(2);
		}else if(!b1 && !b2) {
			System.out.println(3);
		}else if(b1 && !b2) {
			System.out.println(4);
		}
	}
	
	
	
}
