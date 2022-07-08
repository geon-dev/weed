package 그리디;

import java.util.*;

public class Q5585_거스름돈 {

	//https://www.acmicpc.net/problem/5585
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 1000 - sc.nextInt();
		int[] coin = {500, 100, 50, 10, 5, 1};
		
		int cnt = 0;
		for(int i=0; i < coin.length; i++) {
			//System.out.println(coin[i] + " = " +price/coin[i]);
			
			cnt += price/coin[i];
			
			price = price - (price/coin[i])*coin[i];
		}
		
		System.out.println(cnt);
	}
	
	
	
	
	
	
	
	
	
}
