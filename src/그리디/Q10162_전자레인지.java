package 그리디;

import java.util.*;

public class Q10162_전자레인지 {

	//https://www.acmicpc.net/problem/10162
	
	public static void main(String[] arsg) {
		// 버튼 A, B, C에 지정된 시간은 각각 5분, 1분, 10초이다.
		
		//1 ≤ T ≤ 10,000
		//없으면 음수 -1
		
		// 100 >> 0 1 4
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int A = 300;
		int B = 60;
		int C = 10;
		
		// A나눠
		int Acnt = T/A;
		T = T - A*Acnt;
//		System.out.println(Acnt);
//		System.out.println(T);
		
		// B나눠
		int Bcnt = T/B;
		T = T - B*Bcnt;
//		System.out.println(Bcnt);
//		System.out.println(T);
		
		// C나눠
		int Ccnt = T/C;
		T = T - C*Ccnt;
//		System.out.println(Ccnt);
//		System.out.println(T);
		
		if(T == 0) {
			System.out.println(Acnt + " " + Bcnt + " " + Ccnt);
		}else {
			System.out.println(-1);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
