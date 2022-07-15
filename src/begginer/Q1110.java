package begginer;

import java.util.*;

public class Q1110 {

	//https://www.acmicpc.net/problem/1110
	
	public static void main(String[] args) {
/*
26부터 시작한다. 
2+6 = 8이다. 새로운 수는 68이다. 
6+8 = 14이다. 새로운 수는 84이다. 
8+4 = 12이다. 새로운 수는 42이다. 
4+2 = 6이다. 
새로운 수는 26이다.
*/
		int M = new Scanner(System.in).nextInt();
		
		int newM = -1;
		int cnt = 0;
		while(newM != M) {
			if(cnt == 0) newM = M;
			int v1 = newM / 10;
			int v2 = newM % 10;
			int v3 = (v1 + v2) % 10;
			int v4 = (v2*10) + v3;
			newM = v4;
			cnt++;
		}
		
		System.out.println(cnt);
	}
	
	
	
	
	
	
	
}
