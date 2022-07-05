package 브루트포스;

import java.util.*;

public class Q2798_블랙잭 {

	public static void main(String[] args) {
		
		// 입력
		// 선형 구조
		// 탐색
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 카드
		ArrayList<Integer> cardList = new ArrayList<Integer>();
		for(int i = 0 ; i < N; i++) {
			cardList.add(sc.nextInt());
		}
		
		int max = 0;
		// 3장
		for(int i = 0; i < cardList.size()-2; i++) {
			for(int j = i+1; j < cardList.size()-1; j++) {
				for(int q = j+1; q < cardList.size(); q++) {
					
					int sum = cardList.get(i) + cardList.get(j) + cardList.get(q);
					if(sum <= M && sum > max) {
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
